package com.example.amigoscodespringbootmasterclass.customer;

import com.example.amigoscodespringbootmasterclass.exception.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;

    List<Customer> getCustomers() {
        log.info("getCustomers was called");
        return customerRepository.findAll();
    }

    Customer getCustomer(Long customerId) {
        log.info("getCustomer was called with id: " + customerId);
        return customerRepository
                .findById(customerId)
                .orElseThrow(
                        () -> {
                            NotFoundException notFoundException = new NotFoundException(
                                    "Customer " + customerId + " was not found");
                            log.error("getCustomer was called with id: " + customerId +
                                    " but customer was not found", notFoundException);
                            return notFoundException;
                        });
    }
}
