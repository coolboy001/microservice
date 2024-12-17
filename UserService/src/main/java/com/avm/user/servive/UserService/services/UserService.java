package com.avm.user.servive.UserService.services;

import com.avm.user.servive.UserService.entities.Users;

import java.util.List;
import java.util.UUID;

public interface UserService {
    Users createUser(Users user);
    List<Users> getUsers();
    Users getUser(UUID id);
    void deleteUser(UUID id);

}
