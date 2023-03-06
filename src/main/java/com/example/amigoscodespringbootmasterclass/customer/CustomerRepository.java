package com.example.amigoscodespringbootmasterclass.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CustomerRepository implements CustomerRepo{

    // TODO: Connect to real database

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Real database implementation", "123password", "email@gmail.com"),
                new Customer(2L, "Mary Real database implementation", "password123", "email@gmail.com")
        );
    }
}
