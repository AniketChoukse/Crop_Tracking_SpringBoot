package com.CropTracking.CropTracking.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.CropTracking.CropTracking.Entity.CropDetail;
@Repository
public interface ICropDetailDao extends JpaRepository<CropDetail, Long>{

	@Query("select a from CropDetail a where a.userid_fk=:userId")
	public List<CropDetail> findAllByUser(@Param("userId") Long id);
}
