package com.mqkmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.mqkmall.user.mapper")
public class MqkmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqkmallUserApplication.class, args);
    }

}
