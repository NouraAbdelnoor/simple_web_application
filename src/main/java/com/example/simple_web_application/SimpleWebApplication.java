package com.example.simple_web_application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class SimpleWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebApplication.class, args);
    }
   @Bean
    public CommandLineRunner commandLineRunner (ApplicationContext ctx){
        return args -> {
            System.out.println("lets dicover beans in spring boot ");
            String [] beanNames=ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for(String BeanName :beanNames){
                System.out.println(beanNames);
            }

        };
   }

}
