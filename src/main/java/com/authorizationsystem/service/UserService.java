package com.authorizationsystem.service;


import com.authorizationsystem.entity.role.User;
import com.authorizationsystem.entity.role.UserRole;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UserService {

    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
    public User getUserByUsername(String username);
    public void deleteUser(Long userId);
    public User updateUser(User user);
}
