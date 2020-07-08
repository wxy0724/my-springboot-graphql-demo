package com.simmoon.mygraphqldemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.simmoon.**.mapper")
public class MyGraphqlDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyGraphqlDemoApplication.class, args);
    }

}
