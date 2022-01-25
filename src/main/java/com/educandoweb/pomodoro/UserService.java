package com.educandoweb.pomodoro.services;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public List<User> findAll()
    {
        return repository.findAll();
    }
}
