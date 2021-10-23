package com.CropTracking.CropTracking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CropTracking.CropTracking.Dao.IDistrictDao;
import com.CropTracking.CropTracking.Entity.District;

@Service
public class DistrictServiceImpl implements IDistrictService{

	@Autowired
	private IDistrictDao districtDao;
	
	@Override
	public List<District> getDistrict() {
		return districtDao.findAll();
	}

	@Override
	public District getDistrict(Long id) {
		return districtDao.findById(id).get();
	}

	@Override
	public District addDistrict(District district) {
		districtDao.save(district);
		return district;
	}

	@Override
	public District updateDistrict(District district) {
		districtDao.save(district);
		return district;
	}

	@Override
	public void deleteDistrict(Long id) {
		District entity=districtDao.findById(id).get();
		districtDao.delete(entity);
	}

	@Override
	public List<District> getDistrictByState(Long id) {
		return districtDao.findAllByState(id);
	}

}
