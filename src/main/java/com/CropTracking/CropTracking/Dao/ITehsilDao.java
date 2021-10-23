package com.CropTracking.CropTracking.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.CropTracking.CropTracking.Entity.Tehsil;
import java.util.List;

@Repository
public interface ITehsilDao extends JpaRepository<Tehsil,Long>{

	@Query("select a from Tehsil a where a.district.id=:districtId")
	public List<Tehsil> findAllByDistrict(@Param("districtId") Long id);
}
