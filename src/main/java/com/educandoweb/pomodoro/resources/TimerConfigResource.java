
package com.educandoweb.pomodoro.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.educandoweb.pomodoro.entities.TimerConfig;
import com.educandoweb.pomodoro.services.TimerConfigService;

@RestController
@RequestMapping(value = "/settings")
public class TimerConfigResource {

	@Autowired
	private TimerConfigService service;
	@GetMapping
	public ResponseEntity<List<TimerConfig>> findAll() {
		List<TimerConfig> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<TimerConfig> findById(@PathVariable Long id)
	{
		TimerConfig obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
