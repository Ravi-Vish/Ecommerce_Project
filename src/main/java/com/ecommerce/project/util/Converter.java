package com.ecommerce.project.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.ecommerce.project.entities.Customer;
import com.ecommerce.project.model.CustomerDTO;

@Component
public class Converter {


	//Convert to CustomerDTO
	public CustomerDTO convertToCustomerDTO(Customer customer)
	{
		CustomerDTO customerDTO = new CustomerDTO();
		if(customer!=null)
		{
			BeanUtils.copyProperties(customer, customerDTO);
		}
		return customerDTO;
		
	}
	//Convert to CustomerEntity
	public Customer convertToCustomerEntity(CustomerDTO customerDTO) {
		Customer customer = new Customer();
		if(customerDTO!=null)
		{
			BeanUtils.copyProperties(customerDTO, customer);
		}
		return customer;
	}
}
