package com.CropTracking.CropTracking.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CropTracking.CropTracking.Dao.IRoleDao;
import com.CropTracking.CropTracking.Dao.IUserDao;
import com.CropTracking.CropTracking.Entity.Role;
import com.CropTracking.CropTracking.Entity.User;
import com.CropTracking.CropTracking.Entity.UserRole;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Autowired
	private IRoleDao roleDao;

	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		User local = this.userDao.findByUsername(user.getUsername());
		Set<Role> rlist = new HashSet<>();
		if (local != null) {
			System.out.println("User is already there!");
			throw new Exception("User is already present!");
		} else {
			for (UserRole ur : userRoles) {
				Role r = roleDao.save(ur.getRole());
				rlist.add(r);
				System.out.println("role: "+ r.toString());
			}
			user.setRoles(rlist);
			System.out.println("role: "+user.toString());
			local = this.userDao.save(user);
		}
		return local;
	}



	@Override
	public User getUser(String username) {
		return this.userDao.findByUsername(username);
	}

	@Override
	public List<User> getUser() {
		return this.userDao.findAll();
	}

	@Override
	public User updateUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public void deleteUser(Long id) {
		User user=userDao.findById(id).get();
		userDao.delete(user);
	}



	@Override
	public List<User> findByRolename() {
		return userDao.findByRolename();
	}

}
