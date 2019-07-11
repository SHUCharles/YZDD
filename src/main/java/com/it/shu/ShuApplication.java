package com.it.shu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.it.shu.mapper")
public class ShuApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShuApplication.class, args);
    }

}
