package com.ecommerce.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.entities.Category;
import com.ecommerce.project.model.CategoryDTO;
import com.ecommerce.project.model.RequestCategoryDTO;
import com.ecommerce.project.service.CategoryService;

@RestController
public class OrderController {

	@Autowired
	CategoryService  service;
	
	@PostMapping("/insertCategoryDetails")
	public Category placeOrder(@RequestBody CategoryDTO categoryDTO)
	{
		return service.getCategory(categoryDTO);
	}
	
	@GetMapping("/showAllCategory")
	public List<Category> showCategory()
	{
		return service.showCategory();
	}
	
	@GetMapping("/getRequestedCategory")
	public List<RequestCategoryDTO> getInformation()
	{
		return service.getInformation();
	}
}
