package com.CropTracking.CropTracking.Service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.CropTracking.CropTracking.Entity.User;
import com.CropTracking.CropTracking.Entity.UserRole;
@Service
public interface IUserService {

	public User createUser(User user,Set<UserRole> userRoles) throws Exception;
	
	public User getUser(String username);
	
	public List<User> getUser();
	
	public User updateUser(User user);
	
	public void deleteUser(Long id);
	
	public List<User> findByRolename();
	
}
