package com.fish;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.fish.mapper")
@EnableSwagger2
public class FishBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(FishBlogApplication.class,args);
    }
}