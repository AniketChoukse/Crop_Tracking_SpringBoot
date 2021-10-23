package com.CropTracking.CropTracking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CropTracking.CropTracking.Dao.IVillageDao;
import com.CropTracking.CropTracking.Entity.Village;

@Service
public class VillageServiceImpl implements IVillageService{

	@Autowired
	private IVillageDao villageDao;
	
	@Override
	public List<Village> getVillage() {
		return villageDao.findAll();
	}

	@Override
	public Village getVillage(Long id) {
		return villageDao.findById(id).get();
	}

	@Override
	public Village addVillage(Village village) {
		villageDao.save(village);
		return village;
	}

	@Override
	public Village updateVillage(Village village) {
		villageDao.save(village);
		return village;
	}

	@Override
	public void deleteVillage(Long id) {
		Village entity=villageDao.findById(id).get();
		villageDao.delete(entity);
	}

	@Override
	public List<Village> getVillageByTehsil(Long id) {
		return villageDao.findAllByTehsil(id);
	}

}
