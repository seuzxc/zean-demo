package com.eshare.zkcfg.config;

import org.apache.curator.framework.CuratorFramework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/*****
 * @Author zean
 * Created at 2018/3/22
 * @Email zxc200706@hotmail.com
 *
 * purpose : test the zookeeper function
 ****/

@Service
public class CfgTest {

    @Autowired
    private CuratorFramework client;


    @Value("#{cfg['level2']}")
    private String level2;

    /***
     * get the znode data with full path
     * @param path
     * @return
     * @throws Exception
     */
    public String getDataWithClient(String path) throws Exception {
        byte[] data = client.getData().forPath(path);
        return new String(data);
    }

    /***
     * print the znode data according to the @Value annotation
     */
    public void printPropertyValueWithAnnotation() {
        System.err.println(level2);
    }



}
