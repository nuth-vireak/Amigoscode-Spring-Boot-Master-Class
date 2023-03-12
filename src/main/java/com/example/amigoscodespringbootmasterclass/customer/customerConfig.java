package com.example.amigoscodespringbootmasterclass.customer;

import com.example.amigoscodespringbootmasterclass.infoapp.InfoApp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class customerConfig {

    @Value("${app.useFakeCustomerRepo:false}")
    private Boolean useFakeCustomerRepo = true;

    @Bean
    CommandLineRunner commandLineRunner(InfoApp infoApp) {
        return args -> {
            System.out.println("CommandLineRunner");

            System.out.println(infoApp);
        };
    }

    @Bean
    CustomerRepo customerRepo() {
        System.out.println("useFakeCustomerRepo = " + useFakeCustomerRepo);
        return new CustomerFakeRepository();
    }

    // TODO: Connect to real database
}
