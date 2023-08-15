package com.ecommerce.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.entities.Category;
import com.ecommerce.project.model.CategoryDTO;
import com.ecommerce.project.model.RequestCategoryDTO;
import com.ecommerce.project.repository.CategoryRepository;
import com.ecommerce.project.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	
	@Autowired
	private CategoryRepository repository;

	@Override
	public Category getCategory(CategoryDTO categoryDTO) {
		
		return repository.save(categoryDTO.getCategory());
	}

	@Override
	public List<Category> showCategory() {
		return repository.findAll();
	}

	@Override
	public List<RequestCategoryDTO> getInformation() {
		return repository.getJoinInformation();
	}

}
