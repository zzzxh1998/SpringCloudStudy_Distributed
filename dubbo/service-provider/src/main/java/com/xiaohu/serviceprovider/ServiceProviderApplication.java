package com.xiaohu.serviceprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ServiceProviderApplication {

    public static void main(String[] args) {
        System.out.println("==========start==========");
        SpringApplication.run(ServiceProviderApplication.class, args);
        System.out.println("==========end==========");
    }

}
