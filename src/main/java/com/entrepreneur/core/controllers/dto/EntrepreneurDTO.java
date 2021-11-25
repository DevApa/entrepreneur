package com.entrepreneur.core.controllers.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EntrepreneurDTO {

	private int id;
	
	@NotNull
	private String name;
	
	@NotBlank
	private String lastName;
	
	@NotBlank
	private String identify;
	
	@NotBlank
	private String email;
	
	private String address;

	public EntrepreneurDTO() {
	}

	public EntrepreneurDTO(int id, String name, String lastName, String identify, String email, String address) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.identify = identify;
		this.email = email;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentify() {
		return identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
