package com.educandoweb.pomodoro.config;
import exsException.UserRepository;
import org.springframework.context.annotation.Configuration;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run (String...args) throws Exception{
        User u1 = new User(null,"Maria Brown", "maria@gmail.com","9888888","123456");
        User u2 = new User(null,"Alex Green", "alex@gmail.com","98873188","123986");
        userRepository.saveAll(Array.asList(u1,u2));
}

}
