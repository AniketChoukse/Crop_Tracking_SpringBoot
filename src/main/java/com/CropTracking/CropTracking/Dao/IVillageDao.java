package com.CropTracking.CropTracking.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.CropTracking.CropTracking.Entity.Village;

@Repository
public interface IVillageDao extends JpaRepository<Village,Long>{
	
	@Query("select a from Village a where a.tehsil.id=:tehsilId")
	public List<Village> findAllByTehsil(@Param("tehsilId") Long id);

}
