package com.ecommerce.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.entities.Customer;
import com.ecommerce.project.model.CustomerDTO;
import com.ecommerce.project.service.CustomerService;
import com.ecommerce.project.util.Converter;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@Autowired
	private Converter converter;
	
	@PostMapping("/RegisterUser")
	ResponseEntity<CustomerDTO> createCustomer(@Valid @RequestBody CustomerDTO customerDTO)
	{
		final Customer cust = converter.convertToCustomerEntity(customerDTO);
		return new ResponseEntity<CustomerDTO>(service.createCustomer(cust),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllCustomers")
	public List<CustomerDTO> getAllCustomers()
	{
		return service.getAllCustomers();
	}
	@GetMapping("/getCustomerById/{id}")
	public CustomerDTO getCustomerById(@PathVariable int id)
	{
		return service.getCustomerById(id);
	}
	
	@PutMapping("/updateCustomerDetails/{id}")
	public CustomerDTO updateCustomer(@Valid @PathVariable int id,@RequestBody CustomerDTO customerDTO)
	{
		final Customer customer = converter.convertToCustomerEntity(customerDTO);
		return service.updateCustomer(id, customer);
	}
	
	@DeleteMapping("/deleteCustomerById/{id}")
	public String deleteCustomerById(@PathVariable int id)
	{
		return service.deleteCustomerById(id);
	}
}
