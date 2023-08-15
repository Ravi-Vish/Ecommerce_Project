package com.ecommerce.project.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Category {

	@Id
	@GeneratedValue
	private int id;
	private String cname;
	
	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
	@JoinColumn(name="cat_fk", referencedColumnName = "id")
	private List<Product> products;
}
