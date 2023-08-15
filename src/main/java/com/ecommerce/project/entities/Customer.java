package com.ecommerce.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class Customer {

	@Id
	@GeneratedValue
	private int id;
	@Column(name="FirstName")
	private String fname;
	@Column(name="LastName")
	private String lname;
	@Column(name="UserName")
	private String uname;
	@Column(name="Password")
	private String password;
	@Column(name="Email")
	private String email;
	@Column(name="Street")
	private String street;
	@Column(name="City")
	private String city;
	@Column(name="Country")
	private String country;
	@Column(name="Pincode")
	private String pincode;
	@Column(name="PhoneNumber")
	private long ph_no;
	@Column(name="Status")
	private boolean status;
	
	
	
}
