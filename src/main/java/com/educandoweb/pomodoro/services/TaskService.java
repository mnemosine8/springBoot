package com.educandoweb.pomodoro.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.pomodoro.entities.Task;
import com.educandoweb.pomodoro.repositories.TaskRepository;

@Service
public class TaskService {


	@Autowired
    private TaskRepository repository;
    public List<Task> findAll()
    {
        return repository.findAll();
    }
    
    public Task findById(Long id)
    {
    	Optional<Task> obj = repository.findById(id);
    	return obj.get();
    }

}

