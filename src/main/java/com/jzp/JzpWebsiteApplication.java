package com.jzp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Hongyi Zheng
 * @date 2018/12/17
 */
@SpringBootApplication
@Configuration
@ServletComponentScan
public class JzpWebsiteApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(JzpWebsiteApplication.class);
        app.run(args);
    }
}
