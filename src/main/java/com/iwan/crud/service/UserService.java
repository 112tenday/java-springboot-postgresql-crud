package com.iwan.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iwan.crud.model.User;
import com.iwan.crud.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long userid) {
        return userRepository.findById(userid).orElse(null);
    }

    public List<User> saveUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    public void deleteUser(Long userid) {
        userRepository.deleteById(userid);
    }
}

