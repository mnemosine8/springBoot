package com.educandoweb.pomodoro.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.pomodoro.entities.TimerConfig;
import com.educandoweb.pomodoro.repositories.TimerConfigRepository;

@Service
public class TimerConfigService {


	@Autowired
    private TimerConfigRepository repository;
    public List<TimerConfig> findAll()
    {
        return repository.findAll();
    }
    
    public TimerConfig findById(Long id)
    {
    	Optional<TimerConfig> obj = repository.findById(id);
    	return obj.get();
    }

}

