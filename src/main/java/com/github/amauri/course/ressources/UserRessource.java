package com.github.amauri.course.ressources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.amauri.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserRessource {	

	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "123456");
		return ResponseEntity.ok().body(u);
	
	}

}
