package com.CropTracking.CropTracking.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.CropTracking.CropTracking.Entity.Address;
@Repository
public interface IAddressDao extends JpaRepository<Address,Long>{

	@Query("select a from Address a where a.userid_fk=:userId")
	public Address findAddressByUser(@Param("userId") Long id);
}
