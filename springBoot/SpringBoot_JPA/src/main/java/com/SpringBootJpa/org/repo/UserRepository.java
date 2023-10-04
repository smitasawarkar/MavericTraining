package com.SpringBootJpa.org.repo;

import org.springframework.data.repository.CrudRepository;

import com.SpringBootJpa.org.model.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord, String>{

	
	
}
