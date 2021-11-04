package com.mock;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mock")
public class MockDemoApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder();
        SpringApplication application = builder.sources(MockDemoApplication.class)
                .web(WebApplicationType.SERVLET)
                .bannerMode(Banner.Mode.LOG)
                .build();
        application.run();
    }

}