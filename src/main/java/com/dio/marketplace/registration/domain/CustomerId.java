package com.dio.marketplace.registration.domain;

import java.util.UUID;

import org.springframework.util.Assert;

public record CustomerId(UUID id) {

	public CustomerId {
		Assert.notNull(id, "ID must no be null");
	}
	
	public CustomerId() {
		this(UUID.randomUUID());
	}
}
