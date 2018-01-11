package com.lindj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by lindongjie on 18/1/11.
 */

@SpringBootApplication
@EnableZuulProxy
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
