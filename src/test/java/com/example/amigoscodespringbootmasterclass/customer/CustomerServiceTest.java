package com.example.amigoscodespringbootmasterclass.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerServiceTest {

    @Autowired
    private CustomerRepository customerRepository;

    private CustomerService underTest;

    @BeforeEach
    void setUp() {
        underTest = new CustomerService(customerRepository);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomers() {

        // given
        Customer jamila = new Customer(
                1L,
                "Jamila",
                "hello",
                "jamila@gmail.com");

        Customer alex = new Customer(
                2L,
                "Alex",
                "hello",
                "alex@gmail.com");

        customerRepository.saveAll(List.of(jamila, alex));

        // when
        List<Customer> customers = underTest.getCustomers();

        // then
        assertEquals(2, customers.size());
    }

    @Test
    void getCustomer() {

        // given
        Customer jamila = new Customer(
                1L,
                "Jamila",
                "hello",
                "jamila@gmail.com");

        customerRepository.save(jamila);

        // when
        Customer customer = underTest.getCustomer(1L);

        // then
        assertEquals(1L, customer.getId());
        assertEquals("Jamila", customer.getName());
        assertEquals("hello", customer.getPassword());
        assertEquals("jamila@gmail.com", customer.getEmail());
    }
}