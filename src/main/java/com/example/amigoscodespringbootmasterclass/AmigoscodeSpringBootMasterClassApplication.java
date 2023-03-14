package com.example.amigoscodespringbootmasterclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
public class AmigoscodeSpringBootMasterClassApplication {
    public static void main(String[] args) {
        SpringApplication.run(AmigoscodeSpringBootMasterClassApplication.class, args);
    }
}

// Finish lesson 65
