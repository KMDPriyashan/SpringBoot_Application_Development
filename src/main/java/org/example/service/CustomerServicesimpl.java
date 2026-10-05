package org.example.service;

import org.example.model.Customer;

public class CustomerServicesimpl {
    public Customer getCustomer(){
        Customer customer = new Customer();

        customer.setAge(30);
        customer.setName("kamal");
        customer.setContactNumber("0724719902");

        return customer;
    }
}
