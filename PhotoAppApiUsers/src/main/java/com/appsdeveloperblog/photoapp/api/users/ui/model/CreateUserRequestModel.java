package com.appsdeveloperblog.photoapp.api.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {

	
	@NotNull(message="First Name cannot be empty")
	@Size(min=2, message="Minimum size for first name is 2")
	private String firstName;
	
	@NotNull(message="Last Name cannot be empty")
	@Size(min=2, message="Minimum size for last name is 2")
	private String lastName;
	
	@NotNull(message="Password cannot be empty")
	@Size(min=8, max=16, message="Password should be minimum 8 characters and maximum 16 chanracters")
	private String password;
	
	@NotNull(message="Email cannot be empty")
	@Email
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
