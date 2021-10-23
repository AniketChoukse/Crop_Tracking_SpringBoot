package com.CropTracking.CropTracking.Controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CropTracking.CropTracking.Entity.User;

@Controller
@RequestMapping("/user")
@CrossOrigin("*")
public interface IUserController {

	@GetMapping("/getUser")
	public List<User> getUser();
	
	@PostMapping("/save")
	public User addUser(@RequestBody User user) throws Exception;
	
	@GetMapping("/findByUser/{username}")
	public User getUser(@PathVariable("username") String username);

	@PutMapping("/update")
	public User updateUser(@RequestBody User user);
	
	@DeleteMapping("/delete/{userid_pk}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable("userid_pk") String id);
	
	@GetMapping("/findUserByRolename")
	public List<User> getUserByRolename();
}
