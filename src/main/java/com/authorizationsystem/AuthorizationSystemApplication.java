package com.authorizationsystem;

import com.authorizationsystem.entity.role.Role;
import com.authorizationsystem.entity.role.User;
import com.authorizationsystem.entity.role.UserRole;
import com.authorizationsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class AuthorizationSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(AuthorizationSystemApplication.class, args);
	}

	@Autowired
	UserService userService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");

		User user = new User();

		user.setFirstName("tiya");
		user.setEmailId("tiyashadatta@gmail.com");
		user.setUsername("tiyadatta");
		user.setPassword("tiya123456");
		user.setLastName("datta");
		user.setPhone("123456789");
		user.setProfile("default.png");

		Role role1 =new Role();

		role1.setRoleId(44L);
		role1.setRoleName("admin");

		Set<UserRole> userRoleSet=new HashSet<>();
		UserRole userRole= new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);

		userRoleSet.add(userRole);

		User user1 = this.userService.createUser(user, userRoleSet);
		System.out.println(user1.getUsername());

	}
}
