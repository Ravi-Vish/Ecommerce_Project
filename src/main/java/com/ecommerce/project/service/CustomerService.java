package com.ecommerce.project.service;

import java.util.List;

import com.ecommerce.project.entities.Customer;
import com.ecommerce.project.model.CustomerDTO;

public interface CustomerService {

	CustomerDTO createCustomer(Customer customer);
	
    List<CustomerDTO> getAllCustomers();
    
    CustomerDTO getCustomerById(int id);
	
	CustomerDTO updateCustomer(int id,Customer customer);
	
	String deleteCustomerById(int id);
}
