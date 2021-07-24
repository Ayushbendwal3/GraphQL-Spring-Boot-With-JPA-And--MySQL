package com.example.GraphQLWIthSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan({"com.example.query", "com.example.service", "com.example.resolver"})
@EntityScan("com.example.entity")
@EnableJpaRepositories("com.example.repository")
public class GraphQlwIthSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphQlwIthSpringBootApplication.class, args);
    }
}
