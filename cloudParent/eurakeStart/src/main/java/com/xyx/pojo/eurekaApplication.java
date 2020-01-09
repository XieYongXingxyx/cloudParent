package com.xyx.pojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xyx
 * @TIME 2019/11/15 15:07
 */
@EnableEurekaServer
@SpringBootApplication
public class eurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(eurekaApplication.class);
    }
}
