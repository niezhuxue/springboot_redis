package com.example.demo.controller;

import com.example.demo.service.TestJedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JedisController {

    @Autowired
    private TestJedisService testJedisService;

    @RequestMapping("/test")
    public String test(@RequestParam("id") String id,@RequestParam("value") String value){

        return "操作结果："+testJedisService.test(id,value);
    }
}
