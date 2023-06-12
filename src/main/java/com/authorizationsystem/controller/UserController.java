/**
 * Controller class for handling RESTful API requests related to user management.
 * Provides endpoints for user registration and profile retrieval.
 */


package com.authorizationsystem.controller;

import com.authorizationsystem.entity.role.Role;
import com.authorizationsystem.entity.role.User;
import com.authorizationsystem.entity.role.UserRole;
import com.authorizationsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    public UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    /**
     * Create a user's profile information
     *
     * @param user The details of the user
     * @return The user's profile information created in database
     */
    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) throws Exception {

        user.setProfile("default.png");

        //encoding password with bcrypt
        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));

        Set<UserRole> roles = new HashSet<>();

        Role role = new Role();
        role.setRoleId(45L);
        role.setRoleName("Normal");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        roles.add(userRole);

        return this.userService.createUser(user,roles);
    }

    /**
     * Retrieves a user's profile information based on the provided user name.
     *
     * @param username The ID of the user
     * @return The user's profile information
     */
    @GetMapping("/getUserByUsername/{username}")
    public User getUserByUsername(@PathVariable String username){
        return this.userService.getUserByUsername(username);
    }

    @DeleteMapping("/deleteByUserId/{userId}")
    public void deleteById(@PathVariable Long userId){
        this.userService.deleteUser(userId);
    }
}
