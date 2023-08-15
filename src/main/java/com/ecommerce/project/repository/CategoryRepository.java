package com.ecommerce.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.project.entities.Category;
import com.ecommerce.project.model.RequestCategoryDTO;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

	@Query("SELECT new com.ecommerce.project.model.RequestCategoryDTO (c.cname , p.pname , p.price , p.seller) FROM Category c JOIN c.products p")
	public List<RequestCategoryDTO> getJoinInformation();
}
