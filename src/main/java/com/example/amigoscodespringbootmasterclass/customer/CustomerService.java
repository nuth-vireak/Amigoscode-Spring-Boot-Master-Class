package com.example.amigoscodespringbootmasterclass.customer;

import com.example.amigoscodespringbootmasterclass.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomers() {
        return customerRepo.getCustomers();
    }

    Customer getCustomer(Long customerId) {
        return getCustomers()
                .stream()
                .filter(customer -> customer.getId().equals(customerId))
                .findFirst()
                .orElseThrow(() -> new NotFoundException("Customer " + customerId + " was not found"));
    }
}
