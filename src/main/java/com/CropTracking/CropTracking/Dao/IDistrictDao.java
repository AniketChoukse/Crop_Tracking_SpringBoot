package com.CropTracking.CropTracking.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.CropTracking.CropTracking.Entity.District;
@Repository
public interface IDistrictDao extends JpaRepository<District, Long>{

	@Query("select a from District a where a.state.id=:stateId")
	public List<District> findAllByState(@Param("stateId") Long id);
}
