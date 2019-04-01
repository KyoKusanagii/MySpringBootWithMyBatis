package com.max.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {

    @RequestMapping("/hello")
    public String Hello(){
        return "你好SpringBoot!!!";

    }

}
