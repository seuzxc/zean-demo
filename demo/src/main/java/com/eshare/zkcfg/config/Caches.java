package com.eshare.zkcfg.config;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;

/*****
 * @Author zean
 * Created at 2018/3/22
 * @Email zxc200706@hotmail.com
 *
 ****/

public class Caches {

    public static NodeCache nodeCache(CuratorFramework client, String path, DataCfgFactory cfg) {
        final NodeCache cache = new NodeCache(client, path);
        cache.getListenable().addListener(() -> {
            int keyIndex = cache.getPath().lastIndexOf("/");
            String key = cache.getPath().substring(keyIndex + 1);
            cfg.put(key, new String(cache.getCurrentData().getData()));
        });
        return cache;
    }
}
