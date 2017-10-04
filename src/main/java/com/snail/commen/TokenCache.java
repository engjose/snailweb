package com.snail.commen;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 本地缓存,我们可以使用redis替代
 *
 * Created by panyuanyuan on 2017/6/18.
 */
public class TokenCache {

    /**
     * 获取到打印logger的对象
     */
    private static Logger logger = LoggerFactory.getLogger(TokenCache.class);

    /** 定义本地缓存块 */
    private static LoadingCache<String, String> loadingCache = CacheBuilder
        .newBuilder()
        .initialCapacity(1000)
        .maximumSize(10000)
        .expireAfterAccess(12, TimeUnit.HOURS)
        .build(new CacheLoader<String, String>() {

            /**
             * 如果缓存中没有对应的key取到值得时候调用此方法
             *
             * @param s
             * @return
             * @throws Exception
             */
            @Override
            public String load(String s) throws Exception {
                return "null";
            }
        });

    /**
     * 设置本地缓存
     *
     * @param key
     * @param value
     */
    public static void setKey(String key, String value) {
        loadingCache.put(key, value);
    }

    /**
     * 通过key获取本地缓存
     *
     * @param key
     * @return
     */
    public static String getToken(String key) {

        String token = null;
        try{
            token = StringUtils.equals("null", loadingCache.get(key)) ? null : loadingCache.get(key);
        }catch (Exception e) {
            logger.error("get token err", e);
        }

        return token;
    }
}
