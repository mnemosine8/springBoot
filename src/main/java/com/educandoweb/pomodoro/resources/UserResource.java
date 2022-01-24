package com.educandoweb.pomodoro.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.pomodoro.entities.User;



@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;
	@GetMapping
	public ResponseEntity<List<User> findAll()
	{
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
}
