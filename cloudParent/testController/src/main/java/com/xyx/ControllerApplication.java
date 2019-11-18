package com.xyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xyx
 * @TIME 2019/11/15 16:48
 */
@SpringBootApplication
@EnableEurekaClient
public class ControllerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ControllerApplication.class);
    }
}
