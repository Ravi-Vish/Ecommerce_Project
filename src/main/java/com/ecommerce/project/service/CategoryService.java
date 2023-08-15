package com.ecommerce.project.service;

import java.util.List;

import com.ecommerce.project.entities.Category;
import com.ecommerce.project.model.CategoryDTO;
import com.ecommerce.project.model.RequestCategoryDTO;

public interface CategoryService {

	Category getCategory(CategoryDTO categoryDTO);
	
	List<Category> showCategory();
	
	List<RequestCategoryDTO> getInformation();
}
