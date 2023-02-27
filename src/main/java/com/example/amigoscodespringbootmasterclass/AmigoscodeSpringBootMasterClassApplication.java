package com.example.amigoscodespringbootmasterclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AmigoscodeSpringBootMasterClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmigoscodeSpringBootMasterClassApplication.class, args);
    }

    @GetMapping("/")
    Customer getCustomer() {
        return new Customer(1L, "John");
    }

    record Customer(Long id, String name) {}
}
