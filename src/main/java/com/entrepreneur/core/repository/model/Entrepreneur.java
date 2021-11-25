package com.entrepreneur.core.repository.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "entrepreneur")
public class Entrepreneur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger id;

	@Column(name = "nombres")
	private String name;
	// entrepreneur
	@Column(name = "apellidos")
	private String lastName;

	@Column(name = "identificacion")
	private String identify;

	@Column(name = "email")
	@Email(message = "Debe agregar un correo electrónico válido")
	private String email;

	@Column(name = "direccion")
	private String address;

	public Entrepreneur() {
	}

	public Entrepreneur(BigInteger id, String name, String lastName, String identify, String email, String address) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.identify = identify;
		this.email = email;
		this.address = address;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
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
