package com.CropTracking.CropTracking.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CropTracking.CropTracking.Entity.Role;
@Repository
public interface IRoleDao extends JpaRepository<Role, Long>{

}
