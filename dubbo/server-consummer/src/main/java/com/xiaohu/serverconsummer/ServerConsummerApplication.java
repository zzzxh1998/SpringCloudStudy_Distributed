package com.xiaohu.serverconsummer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerConsummerApplication {

    public static void main(String[] args) {
        System.out.println("=============start===============");
        SpringApplication.run(ServerConsummerApplication.class, args);
        System.out.println("=============end===============");
    }

}
