package com.burger.demo.service;

import com.burger.demo.model.Customer;
import com.burger.demo.reposatary.CustomerReposatary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerReposatary cusRepo;



    public  void addCustomer(Customer cus){
        cusRepo.save(cus);
    }


    public List<Customer> getAllCustomers() {
        return cusRepo.findAll();
    }

    public Customer getCustomer(int id) {
        return cusRepo.findById(id).get();
    }

    public void deleteCustomer(int id) {
        cusRepo.deleteById(id);
    }

    public void updateCustomer(int id, Customer updatedCustomer) {
        Customer existingCustomer = cusRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        existingCustomer.setName(updatedCustomer.getName());
        existingCustomer.setEmail(updatedCustomer.getEmail());
        existingCustomer.setMobile(updatedCustomer.getMobile());
        existingCustomer.setAddress(updatedCustomer.getAddress());

        cusRepo.save(existingCustomer); // Save updated entity
    }
}
