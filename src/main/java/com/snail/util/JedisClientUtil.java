package com.snail.util;

import com.snail.exception.SnailServerException;
import java.util.ResourceBundle;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Jedis的工具类
 *
 * Created by panyuanyuan 2017/10/5
 */
public class JedisClientUtil {

    private static JedisPool pool;

    static  {
        ResourceBundle bundle = ResourceBundle.getBundle("redis");
        if (null == bundle) {
            throw new SnailServerException(-1, "redis.properties not found");
        }

        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(Integer.valueOf(bundle
            .getString("redis.pool.maxActive")));
        config.setMaxIdle(Integer.valueOf(bundle
            .getString("redis.pool.maxIdle")));
        config.setMaxWaitMillis(Long.valueOf(bundle.getString("redis.pool.maxWait")));

        String host = bundle.getString("redis.host");
        Integer port = Integer.valueOf(bundle.getString("redis.port"));
        pool = new JedisPool(config, host, port, 3000, bundle.getString("redis.password"));
    }

    /**
     * 获取一个jedis资源
     *
     * @return
     */
    public static Jedis getJedis() {
        return pool.getResource();
    }

    /**
     * 释放jedis资源
     *
     * @param jedis
     */
    public static void closeJedis(Jedis jedis) {
        pool.returnResource(jedis);
    }
}
