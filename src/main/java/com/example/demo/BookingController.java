package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

	private static final Logger logger = LoggerFactory.getLogger(BookingController.class);
	
	SlotRepository repository;
		
	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}

	@PostMapping(path = "/book", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String send(@RequestBody Slot slot) {
		repository.save(slot);
		return null;
	}

	@GetMapping("/slots")
	List<Slot> all() {
		return repository.findAll();
	}

}

