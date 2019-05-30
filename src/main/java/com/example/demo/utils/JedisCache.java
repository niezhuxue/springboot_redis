package com.example.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class JedisCache {

    @Autowired
    private JedisPool jedisPool;

    /**
     * set方法
     * */
    public String set(String key ,String value){
        Jedis jedis = null;
        String result = null;
        try{
            jedis = jedisPool.getResource();

            result = jedis.set(key,value);
        }catch (Exception e){
            result = "0";
            e.printStackTrace();
        }finally {
            jedis.close();
        }
        return result;
    }
}
