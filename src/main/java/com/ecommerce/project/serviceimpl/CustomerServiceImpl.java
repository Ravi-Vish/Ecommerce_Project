package com.ecommerce.project.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.entities.Customer;
import com.ecommerce.project.exception.ResourceNotFoundException;
import com.ecommerce.project.model.CustomerDTO;
import com.ecommerce.project.repository.CustomerRepository;
import com.ecommerce.project.service.CustomerService;
import com.ecommerce.project.util.Converter;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;
	
	
	@Autowired
	private Converter converter;

	@Override
	public CustomerDTO createCustomer(Customer customer) {
		
		Customer cust = repository.save(customer);
		return converter.convertToCustomerDTO(cust);
	}

	@Override
	public List<CustomerDTO> getAllCustomers() {
		
		List<Customer> customers = repository.findAll();
		
		List<CustomerDTO> dtoList = new ArrayList<>();
		for(Customer c : customers)
		{
			dtoList.add(converter.convertToCustomerDTO(c));
		}
		return dtoList;
	}
	
	@Override
	public CustomerDTO getCustomerById(int id)
	{
		Customer cust = repository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Customer", "Id" , id));
		return converter.convertToCustomerDTO(cust);
	}

	@Override
	public CustomerDTO updateCustomer(int id, Customer customer) {
		
		Customer c = repository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Customer", "Id", id));
		c.setFname(customer.getFname());
		c.setLname(customer.getLname());
		c.setEmail(customer.getEmail());
		c.setUname(customer.getUname());
		c.setPassword(customer.getPassword());
		
		Customer cust = repository.save(c);
		return converter.convertToCustomerDTO(cust);
	}

	@Override
	public String deleteCustomerById(int id) {
		repository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Customer", "Id" , id));
		
		repository.deleteById(id);
		return "Customer got deleted";
		
		
	}
	

}
	

