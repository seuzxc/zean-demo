package com.eshare.zkcfg.config;

import java.util.List;
import java.util.stream.Collectors;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.CollectionUtils;

/*****
 * @Author zean
 * Created at 2018/3/22
 * @Email zxc200706@hotmail.com
 *
 ****/

@Configuration
public class ZkConfig {

    @Value("${zookeeper.host}")
    private String zkHost;

    @Value("${zookeeper.project.prefix}")
    private String projectZkPath;

    /***
     * the client to operate zookeeper
     * @return
     */
    @Bean
    public CuratorFramework getCuratorFrameworkClient() {
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        CuratorFramework client = CuratorFrameworkFactory.newClient(zkHost, retryPolicy);
        client.start();
        return client;
    }


    /***
     * build the cfg for configuration
     * @return
     * @throws Exception
     */
    @Bean
    public DataCfgFactory cfg() throws Exception {
        DataCfgFactory dataCfg = new DataCfgFactory();
        //init data in the path /com/eshare

        CuratorFramework client = getCuratorFrameworkClient();

        List<String> children = client.getChildren().forPath(projectZkPath);

        List<String> childrenPath = getFullPathChildren(children, projectZkPath);

        return buildCfg(childrenPath, dataCfg, client);
    }

    /***
     * get all configuration data from zk
     * @param childrenPaths
     * @param dataCfg
     * @param client
     * @return
     * @throws Exception
     */
    private DataCfgFactory buildCfg(List<String> childrenPaths, DataCfgFactory dataCfg,
        CuratorFramework client)
        throws Exception {
        if (CollectionUtils.isEmpty(childrenPaths)) {
            return dataCfg;
        }

        for (String path : childrenPaths) {

            NodeCache nodeCache = Caches.nodeCache(client, path,dataCfg);
            nodeCache.start(true);

            byte[] data = client.getData().forPath(path);
            int indexOfCurrentNode = path.lastIndexOf("/") + 1;
            dataCfg.put(path.substring(indexOfCurrentNode), new String(data));
            //preorder traversal of the zookeeper nodes
            List<String> children = client.getChildren().forPath(path);
            if (!CollectionUtils.isEmpty(children)) {
                buildCfg(getFullPathChildren(children, path), dataCfg, client);
            }
        }

        return dataCfg;
    }

    /***
     * rebuild the short path with parentPath added
     *  eg: in zookeeper server , the full path is /com/eshare/smsCount
     *  param path is smsCount, parentPath is /com/eshare
     *  the result is /com/eshare/smsCount
     * @param children
     * @param parentPath
     * @return
     */
    private List<String> getFullPathChildren(List<String> children, String parentPath) {
        List<String> childrenPath = children.stream().map(elem -> parentPath + "/" + elem).collect(
            Collectors.toList());
        return childrenPath;
    }
}
