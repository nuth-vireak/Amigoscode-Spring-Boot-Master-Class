package com.example.amigoscodespringbootmasterclass.customer;

import com.example.amigoscodespringbootmasterclass.exception.ApiRequestException;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("api/v2/customers")
@RestController
@AllArgsConstructor
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @GetMapping
    List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long customerId) {
        return customerService.getCustomer(customerId);
    }

    @GetMapping(path = "{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") Long customerId) {
        throw new ApiRequestException("ApiRequestException: Customer with id " + customerId + " not found");
    }

    @PostMapping
    void createNewCustomer(@Valid @RequestBody Customer customer) {
        System.out.println("POST REQUEST...");
        System.out.println(customer);
    }
}
