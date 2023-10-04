package com.logingSpringBoot.org;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootForElkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootForElkApplication.class, args);
	}
}

@RestController
class ELKRestController {

	private static final Logger LOG = LoggerFactory.getLogger(ELKRestController.class);

	@GetMapping("/hello")
	public ResponseEntity<String> greet() {
		LOG.info("Hello World!");

		return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
	}

}
