package com.jiawa.wiki.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.jiawa")
@SpringBootApplication
public class WikiApplication {

    public static void main(String[] args) {

        SpringApplication.run(WikiApplication.class, args);


    }

}
