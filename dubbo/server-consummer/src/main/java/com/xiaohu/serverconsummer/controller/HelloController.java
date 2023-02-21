package com.xiaohu.serverconsummer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.xiaohu.commonapi.api.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("sayhello")
    public String sayHello(String message){
        return helloService.sayHello(message);
    }

}
