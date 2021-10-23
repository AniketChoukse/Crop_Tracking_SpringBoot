package com.CropTracking.CropTracking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CropTracking.CropTracking.Dao.ITehsilDao;
import com.CropTracking.CropTracking.Entity.Tehsil;

@Service
public class TehsilServiceImpl implements ITehsilService{

	@Autowired
	private ITehsilDao tehsilDao;
	
	@Override
	public List<Tehsil> getTehsil() {
		return tehsilDao.findAll();
	}

	@Override
	public Tehsil getTehsil(Long id) {
		return tehsilDao.findById(id).get();
	}

	@Override
	public Tehsil addTehsil(Tehsil tehsil) {
		tehsilDao.save(tehsil);
		return tehsil;
	}

	@Override
	public Tehsil updateTehsil(Tehsil tehsil) {
		tehsilDao.save(tehsil);
		return tehsil;
	}

	@Override
	public void deleteTehsil(Long id) {
		Tehsil entity=tehsilDao.findById(id).get();
		tehsilDao.delete(entity);
		
	}

	@Override
	public List<Tehsil> getTehsilByDistrict(Long id) {
		return tehsilDao.findAllByDistrict(id);
	}

}
