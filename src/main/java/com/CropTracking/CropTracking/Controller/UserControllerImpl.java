package com.CropTracking.CropTracking.Controller;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RestController;
import com.CropTracking.CropTracking.Entity.Role;
import com.CropTracking.CropTracking.Entity.User;
import com.CropTracking.CropTracking.Entity.UserRole;
import com.CropTracking.CropTracking.Service.IUserService;

@RestController
public class UserControllerImpl implements IUserController{

	@Autowired
	private IUserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public User addUser(User user) throws Exception {
		
		//encoding password with bcryptpasswordencoder
		user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
		
		Set<UserRole> roles=new HashSet<>();
		Role role=new Role();
		//role.setRoleid(10L);
		role.setRolename("USER");
		UserRole userRole=new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		roles.add(userRole);
		return this.userService.createUser(user,roles);	
        //return user;
	}

	@Override
	public User getUser(String username) {
		return this.userService.getUser(username);
	}

	@Override
	public List<User> getUser() {
		return this.userService.getUser();
	}

	@Override
	public User updateUser(User user) {
		return this.userService.updateUser(user);
	}

	@Override
	public ResponseEntity<HttpStatus> deleteUser(String id) {
		try {
			this.userService.deleteUser(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public List<User> getUserByRolename() {
		return userService.findByRolename();	
	}

}
