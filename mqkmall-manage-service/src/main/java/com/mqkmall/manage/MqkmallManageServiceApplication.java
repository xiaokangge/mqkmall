package com.mqkmall.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.mqkmall.manage")
public class MqkmallManageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqkmallManageServiceApplication.class, args);
    }

}
