package com.example.amigoscodespringbootmasterclass.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Collections;
import java.util.List;

@RequestMapping("api/v2/customer")
@RestController
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "all")
    List<Customer> getCustomer() {
        return Collections.singletonList(
                new Customer(0L, "V2", "V2")
        );
    }

    @PostMapping("/")
    void createNewCustomer(@RequestBody Customer customer) {
        System.out.println("POST REQUEST...");
        System.out.println(customer);
    }

    @PutMapping("/")
    void updateCustomer(@RequestBody Customer customer) {
        System.out.println("PUT REQUEST...");
        System.out.println(customer);
    }
    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long customerId) {
        System.out.println("DELETE REQUEST FOR CUSTOMER ID: " + customerId);
        System.out.println(customerId);
    }
}
