package com.CropTracking.CropTracking.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CropTracking.CropTracking.Entity.State;
@Repository
public interface IStateDao extends JpaRepository<State, Long>{

}
