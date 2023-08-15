package com.ecommerce.project.model;

import com.ecommerce.project.entities.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CategoryDTO {

	private Category category;
}
