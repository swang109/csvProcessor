package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void createUser(Customer customer) {
        if(customerRepository.existsById(customer.getUsername())) {
            throw new RuntimeException("user exist");
        }
        customerRepository.save(customer);
    }
}
