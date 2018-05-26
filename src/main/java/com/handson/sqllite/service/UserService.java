package com.handson.sqllite.service;


import com.handson.sqllite.models.User;
import com.handson.sqllite.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> findAll() {
        return this.userRepository.findAll();
    }
}
