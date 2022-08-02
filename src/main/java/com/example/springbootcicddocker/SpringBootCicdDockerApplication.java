package com.example.springbootcicddocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCicdDockerApplication {

    @GetMapping("/welcome")
    public String getMS1(){
        return "*---Welcome to java Techie----*";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCicdDockerApplication.class, args);
    }

}
