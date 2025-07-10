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


    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customer.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable int id){
        return customer.getCustomer(id);
    }

    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer cus){
        customer.addCustomer(cus);
    }

    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable int id){
        customer.deleteCustomer(id);
    }

    @PutMapping("/customer/{id}")
    public void updateCustomer(@PathVariable int id, @RequestBody Customer cus){
        customer.updateCustomer(id,cus);
    }
    }
