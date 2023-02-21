package com.xiaohu.serviceprovider.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaohu.commonapi.api.HelloService;



@Service(interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService{

    @Override
    public String sayHello(String message) {
        return "hello" + message;
    }
}
