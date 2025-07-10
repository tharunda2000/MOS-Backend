package com.burger.demo.controller;


import com.burger.demo.model.Customer;
import com.burger.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customer;

    @GetMapping("/customer")
    public List<Customer> getCustomer(){

        return customer.getCustomer();

    }

    @GetMapping("/customer/{id}")
    public Customer getCusById(@PathVariable String id){
        return customer.getCusById(id);

    }

    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer cus){
        customer.addCustomer(cus);
    }
}
