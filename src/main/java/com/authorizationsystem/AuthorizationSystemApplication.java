package com.authorizationsystem;

import com.authorizationsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AuthorizationSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(AuthorizationSystemApplication.class, args);
	}

	@Autowired
	UserService userService;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("starting code");
//
//		User user = new User();
//
//		user.setFirstName("tiyasha");
//		user.setEmailId("tiyashadatta@gmail.com");
//		user.setUsername("tiyashadatta");
//		user.setPassword(this.bCryptPasswordEncoder.encode("tiya1234"));
//		user.setLastName("datta");
//		user.setPhone("123456789");
//		user.setProfile("default.png");
//
//		Role role1 =new Role();
//
//		role1.setRoleId(44L);
//		role1.setRoleName("admin");
//
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole= new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//
//		userRoleSet.add(userRole);
//
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());

	}
}
