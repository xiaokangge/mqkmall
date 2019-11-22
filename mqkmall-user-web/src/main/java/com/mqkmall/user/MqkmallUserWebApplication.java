package com.mqkmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan(basePackages = "com.mqkmall.user.mapper")
public class MqkmallUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqkmallUserWebApplication.class, args);
    }

}
