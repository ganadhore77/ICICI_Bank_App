package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.entity.ICICI_Entity;

@Repository
public interface ICICIRepository extends MongoRepository<ICICI_Entity, String> {
	
	@Query("{'account_number': ?0}")
	ICICI_Entity findByAccountNumber(String accountNumber);
}
