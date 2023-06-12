package com.authorizationsystem.repository;


import com.authorizationsystem.entity.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
