package com.authorizationsystem.repository;

import com.authorizationsystem.entity.role.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {

    public User findByUsername(String username);
}
