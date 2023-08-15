package com.ecommerce.project.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDTO {

	@NotNull(message="Please Enter your Firstname.")
	@Size(min=3,max=10,message="You have to enter maximum 10 characters only.")
	private String fname;
	@NotNull(message="Please Enter your Lastname.")
	@Size(min=5,max=15,message="You have to enter maximum 15 characters only.")
	private String lname;
	@NotNull(message="Please Enter your username.")
	@Size(min=6,max=10,message="You have to enter maximum 10 characters only.")
	private String uname;
	@NotNull(message="Please Enter your password.")
	@Size(min=6,max=10,message="You have to enter maximum 10 characters only.")
	private String password;
	@NotNull(message="Please Enter your username.")
	@Email(message="Please use your email with @ sign.")
	private String email;
	@NotNull(message="Please Enter your street.")
	@Size(min=6,max=10,message="You have to enter maximum 10 characters only.")
	private String street;
	@NotNull(message="Please Enter your city.")
	@Size(min=6,max=10,message="You have to enter maximum 10 characters only.")
	private String city;
	@NotNull(message="Please Enter your country.")
	@Size(min=6,max=10,message="You have to enter maximum 10 characters only.")
	private String country;
	@NotNull(message="Please Enter your pincode.")
	@Size(min=6,message="You have to enter minimum 6 number only.")
	private String pincode;
	@NotNull(message="Please Enter your phone_number.")
	@Size(min=10,message="You have to enter minimum 10 characters only.")
	private long ph_no;
	@NotNull(message="Please confirm your details.")
	private boolean status;
}
