package com.xyx;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xyx
 * @TIME 2019/11/26 11:22
 */
@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class mybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(mybatisApplication.class);
    }
}



