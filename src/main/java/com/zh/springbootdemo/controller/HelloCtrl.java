package com.zh.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zh")
public class HelloCtrl {

    @RequestMapping("/hello")
    public String getHello(){
        return "hello";
    }
}
