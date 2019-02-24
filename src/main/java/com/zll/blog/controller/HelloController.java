package com.zll.blog.controller;


import com.zll.blog.config.StudentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private StudentProperties studentProperties;

    @GetMapping("/hello")
    public String hello(){
        return "姓名："+studentProperties.getName() + ", 年龄"+studentProperties.getAge();
    }
}
