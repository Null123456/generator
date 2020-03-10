package com.tj.resumption;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.tj.resumption.controller","com.tj.resumption.service.impl"})
@MapperScan(basePackages = {"com.tj.resumption.mapper"})
public class ResumptionApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ResumptionApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ResumptionApplication.class);
    }

}
