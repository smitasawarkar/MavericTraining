package com.SpringBootJpa.org.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.SpringBootJpa.org.model.UserRecord;
import com.SpringBootJpa.org.repo.UserRepository;

@Service    
public class UserService   
{    
	@Autowired    
	private UserRepository userRepository;    
	public List<UserRecord> getAllUsers()  
	{    
		List<UserRecord>userRecords = new ArrayList<>();    
		userRepository.findAll().forEach(userRecords::add);    
		return userRecords;    
	}    
	public void addUser(UserRecord userRecord)  
	{    
		userRepository.save(userRecord);    
	}    
	
	
	
	
}
		
	
  