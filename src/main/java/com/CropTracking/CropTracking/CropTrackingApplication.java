package com.CropTracking.CropTracking;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.CropTracking.CropTracking.Entity.Role;
import com.CropTracking.CropTracking.Entity.User;
import com.CropTracking.CropTracking.Entity.UserRole;
import com.CropTracking.CropTracking.Service.IUserService;

@SpringBootApplication
public class CropTrackingApplication /*implements CommandLineRunner*/{

//	@Autowired
//	private IUserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(CropTrackingApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Starting code");
//		
//		User user=new User();
//		user.setFirstName("Akash");
//		user.setLastName("Peyal");
//		user.setContact(9340291390L);
//		user.setPassword("abc");
//		user.setAddressId_fk(1L);
//		user.setUsername("akash10");
//		
//		Role role1=new Role();
//		//role1.setRoleid(1L);
//		role1.setRolename("Admin");
//		
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		
//		userRoleSet.add(userRole);
//		
//		User user1=this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
//		//System.out.println(user1.getUserRole());
//	}

}
