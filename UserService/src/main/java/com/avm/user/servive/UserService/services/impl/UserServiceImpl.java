package com.avm.user.servive.UserService.services.impl;

import com.avm.user.servive.UserService.entities.Users;
import com.avm.user.servive.UserService.exception.ResourceNotFoundException;
import com.avm.user.servive.UserService.repositories.UserRepository;
import com.avm.user.servive.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Users createUser(Users user) {

        return userRepository.save(user);
    }

    @Override
    public List<Users> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public Users getUser(UUID id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User with give id " + id + " not found"));
    }

    @Override
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }
}
