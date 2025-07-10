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


}
