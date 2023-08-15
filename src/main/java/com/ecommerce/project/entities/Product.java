package com.ecommerce.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Product {

	@Id
	private int pid;
	private String pname;
	private int price;
	private int pqty;
	private String seller;
}	

