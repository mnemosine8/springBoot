package com.educandoweb.pomodoro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.pomodoro.entities.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{
	

}







