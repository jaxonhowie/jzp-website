package com.jzp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @author Hongyi Zheng
 * @date 2018/12/17
 */
@SpringBootApplication
@Configuration
public class JzpWebsiteApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(JzpWebsiteApplication.class);
        app.run(args);
    }
}
