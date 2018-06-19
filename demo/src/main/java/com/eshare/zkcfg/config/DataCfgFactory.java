package com.eshare.zkcfg.config;

import java.util.concurrent.ConcurrentHashMap;


/*****
 * @Author zean
 * Created at 2018/3/22
 * @Email zxc200706@hotmail.com
 *
 * it's used to store config in map style
 *
 ****/

public class DataCfgFactory extends ConcurrentHashMap<String,String> {

    @Override
    public String toString() {
        return super.toString();
    }
}
