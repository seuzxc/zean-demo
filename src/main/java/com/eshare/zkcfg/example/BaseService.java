package com.eshare.zkcfg.example;

import org.apache.curator.framework.CuratorFramework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*****
 * @Author zean
 * Created at 2018/3/23
 * @Email zxc200706@hotmail.com
 *
 ****/

@Service
public class BaseService {


    @Autowired
    private CuratorFramework client;

    public void createNode(String path,String data) throws Exception{
       client.create().forPath(path,data.getBytes());
    }

    public void existsNode(String path) throws Exception {
        client.checkExists().forPath(path);
    }

    public void deleteNode(String path) throws Exception {
        client.delete().forPath(path);
    }
}
