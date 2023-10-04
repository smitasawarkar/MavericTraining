package com.SpringBootJpa.org.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootJpa.org.Service.UserService;
import com.SpringBootJpa.org.model.UserRecord;
import com.SpringBootJpa.org.repo.UserRepository;

@RestController
public class UserController {
	private final UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public List<UserRecord> getAllUser() {
		return userService.getAllUsers();
	}

	@RequestMapping(value = "/add-user", method = RequestMethod.POST)
	public void addUser(@RequestBody UserRecord userRecord) {
		userService.addUser(userRecord);
	}

	@DeleteMapping("/deleteUserById/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable String id) {
		Optional<UserRecord> optionaluser = userRepository.findById(id);

		try {
			Optional<UserRecord> optionalUser = userRepository.findById(id);

			if (optionalUser.isPresent()) {
				userRepository.deleteById(id);
				return new ResponseEntity<>("User with ID " + id + " deleted successfully.", HttpStatus.OK);
			} else {
				return new ResponseEntity<>("User with ID " + id + " not found.", HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
			return new ResponseEntity<>("An error occurred while processing the request.",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}