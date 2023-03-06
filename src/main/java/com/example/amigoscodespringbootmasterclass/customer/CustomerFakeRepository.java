package com.example.amigoscodespringbootmasterclass.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo{

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Fake database implementation", "123password", "email@gmail.com"),
                new Customer(2L, "Mary Fake database implementation", "password123", "email@gmail.com")
        );
    }
}
