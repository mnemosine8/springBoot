package com.educandoweb.pomodoro.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


import com.educandoweb.pomodoro.entities.User;
import com.educandoweb.pomodoro.repositories.UserRepository;



@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run (String...args) throws Exception{
        User u1 = new User(null,"Maria Brown", "maria@gmail.com","9888888","123456");
        User u2 = new User(null,"Alex Green", "alex@gmail.com","98873188","123986");
        userRepository.saveAll(Arrays.asList(u1,u2));
}

}
