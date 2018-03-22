package com.eshare.zkcfg.controller;

import com.eshare.zkcfg.config.DataCfgFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*****
 * @Author zean
 * Created at 2018/3/22
 * @Email zxc200706@hotmail.com
 *
 ****/


@RestController
public class TestController {

    @Autowired
    private DataCfgFactory cfg;


    /***
     * get config data in zookeeper with key
     * @param key
     * @return
     */
    @GetMapping(value = "/zk-data/{key}")
    public String getZkCfgData(@PathVariable("key") String key) {
        return cfg.get(key);
    }
}
