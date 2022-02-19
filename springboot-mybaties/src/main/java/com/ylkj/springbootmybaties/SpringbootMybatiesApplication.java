package com.ylkj.springbootmybaties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ylkj.springbootmybaties.dao")
public class SpringbootMybatiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatiesApplication.class, args);
    }

}
