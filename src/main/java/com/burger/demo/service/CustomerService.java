package com.burger.demo.service;

import com.burger.demo.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer("001","Tharunda","De silva","0769953180","20020900378"),
            new Customer("002","Nimal","diaz","0769938980","20040900378")));

    public List<Customer> getCustomer(){

        return customers;

    }

    public Customer getCusById(String id) {
        return customers.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(new Customer("NOT FOUND","NOT FOUND","NOT FOUND","NOT FOUND","NOT FOUND"));
    }

    public  void addCustomer(Customer cus){
        customers.add(cus);
    }


}
