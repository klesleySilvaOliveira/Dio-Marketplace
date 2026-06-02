package com.dio.marketplace.registration.infrastructure.persistence.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.dio.marketplace.registration.infrastructure.persistence.entity.Customer;

public interface CustomerEntityRepository extends CrudRepository<Customer, UUID> {

}
