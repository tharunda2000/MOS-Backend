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



    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer cus){
        customer.addCustomer(cus);
    }
}
