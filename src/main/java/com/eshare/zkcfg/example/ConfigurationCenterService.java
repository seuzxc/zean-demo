package com.eshare.zkcfg.example;

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
public class ConfigurationCenterService {

    @Autowired
    private CuratorFramework client;


    @Value("#{cfg['level2']}")
    private String level2;

    /***
     * get the znode data with full path, the return data is sync with server
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
     * the value was set and the bean created, if the data in server is updated after the bean created
     * the value in this application wouldn't change
     */
    public String getDataInitAtApplicationStart() {
        return level2;
    }




}
