package com.zll.blog;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private StudentProperties studentProperties;

    @RequestMapping("/hello")
    public String hello(){
        return "姓名："+studentProperties.getName() + ", 年龄"+studentProperties.getAge();
    }
}
