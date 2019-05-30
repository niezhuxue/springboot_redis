package com.example.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;

@Component
public class JedisCache {

    @Autowired
    private JedisPool jedisPool;

    public void set(String key ,Object value){

    }
}
