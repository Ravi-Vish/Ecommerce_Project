package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.project.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
