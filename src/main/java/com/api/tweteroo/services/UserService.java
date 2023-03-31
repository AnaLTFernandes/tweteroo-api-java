package com.api.tweteroo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.tweteroo.dto.UserDTO;
import com.api.tweteroo.models.User;
import com.api.tweteroo.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void create(UserDTO user) {
        repository.save(new User(user));
    }

    public List<User> findByUsernameEquals(String username) {
        return repository.findByUsernameEquals(username);
    }
}
