package com.ecommerce.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestCategoryDTO {

	private String cname;
	private String pname;
	private int price;
	private String seller;
}
