package com.burger.demo.reposatary;

import com.burger.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerReposatary extends JpaRepository<Customer,Integer> {
}
