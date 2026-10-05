package org.example.controller;

import org.example.model.Customer;
import org.example.service.CustomerServicesimpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class CustomerController {
    @GetMapping("/customer")
    Customer getCustomer(){
        CustomerServicesimpl services = new CustomerServicesimpl();
        Customer customer = services.getCustomer();
        System.out.println(customer);
        return customer;
    }
}
