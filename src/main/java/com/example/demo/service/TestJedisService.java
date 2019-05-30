package com.example.demo.service;

import com.example.demo.utils.JedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestJedisService {

    @Autowired
    private JedisCache jedisCache;

    public String test(String key,String value){

        return jedisCache.set(key,value);
    }
}
