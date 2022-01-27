package com.educandoweb.pomodoro.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.pomodoro.entities.Task;
import com.educandoweb.pomodoro.entities.TimerConfig;
import com.educandoweb.pomodoro.entities.User;
import com.educandoweb.pomodoro.repositories.TaskRepository;
import com.educandoweb.pomodoro.repositories.TimerConfigRepository;
import com.educandoweb.pomodoro.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TaskRepository taskRepository;
	@Autowired
	private TimerConfigRepository timerConfigRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
	
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		Task t1 = new Task(null, "Marcar consulta", "consulta com oftamologista as 14h", u1);
		Task t2 = new Task(null, "Curso JS", "Estudar aula 2", u1);
		Task t3 = new Task(null, "Curso JS", "Estudar aula 3", u1);
		Task t4 = new Task(null, "Email", "Responder os emails", u2);
		Task t5 = new Task(null, "Terminar código", "", u2);
		
		TimerConfig tc1 = new TimerConfig (null,25, 5, 25, 4,u1);
		TimerConfig tc2 = new TimerConfig (null,20, 5, 15, 4,u2);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		taskRepository.saveAll(Arrays.asList(t1,t2,t2,t3,t4,t5));
		timerConfigRepository.saveAll(Arrays.asList(tc1,tc2));
		
	}
}