package com.jrmanchay.spring_security.repository;

import com.jrmanchay.spring_security.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {


    Optional<CustomerEntity> findByEmail(String email);
}
