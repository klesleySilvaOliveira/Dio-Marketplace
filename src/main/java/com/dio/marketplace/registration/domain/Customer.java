package com.dio.marketplace.registration.domain;

import org.springframework.util.Assert;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

	private CustomerId id;
	private String name;
	private String email;
	
	public Customer(CustomerId id, String name, String email) {
		super();
		
		Assert.notNull(name, "Name must not be null");
		Assert.notNull(email, "E-mail must not be null");
		
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public Customer(String name, String email) {
		this(new CustomerId(), name, email);
	}
}
