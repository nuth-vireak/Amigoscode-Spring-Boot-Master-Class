package com.example.amigoscodespringbootmasterclass.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Component
@Primary
public class CustomerRepository implements CustomerRepo{

    // TODO: Connect to real database

    @Override
    public List<Customer> getCustomers() {
        return Collections.emptyList();
    }
}
