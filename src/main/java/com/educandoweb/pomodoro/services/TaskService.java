package com.educandoweb.pomodoro.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.pomodoro.entities.Task;
import com.educandoweb.pomodoro.entities.User;
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
    
    public Task insert(Task obj)
    {
    	return repository.save(obj);
    }
    
    public void delete(Long id)
    {
    	repository.deleteById(id);
    }

    public Task update(Long id, Task obj)
    {
    	try {
    		Task entity = repository.getOne(id);
        	updateData(entity,obj);
        	return repository.save(entity);
    	} catch(EntityNotFoundException e)
    	{
    		throw new ResourceNotFoundException(id);
    		
    	}
    	
    }

    private void updateData(Task entity, Task obj) {
		// TODO Auto-generated method stub
		entity.setDescription(obj.getDescription());
	}

}

