package com.CropTracking.CropTracking.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.CropTracking.CropTracking.Entity.User;
@Repository
public interface IUserDao extends JpaRepository<User, Long> {

	public User findByUsername(String username);
	
	@Query(value="select * from user u inner join userrole ur on u.userid_pk=ur.userid_fk inner join role ro on ro.roleid_pk=ur.roleid_fk where rolename='USER'", nativeQuery = true)
	public List<User> findByRolename();
	//public User findByContact(Long contact);
}
