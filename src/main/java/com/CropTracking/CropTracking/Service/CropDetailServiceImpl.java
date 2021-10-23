package com.CropTracking.CropTracking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CropTracking.CropTracking.Dao.ICropDetailDao;
import com.CropTracking.CropTracking.Entity.CropDetail;

@Service
public class CropDetailServiceImpl implements ICropDetailService{

	@Autowired
	private ICropDetailDao cropDetailDao;
	
	@Override
	public List<CropDetail> getCropDetail() {
		return cropDetailDao.findAll();
	}

	@Override
	public CropDetail getCropDetail(Long id) {
		return cropDetailDao.findById(id).get();
	}

	@Override
	public CropDetail addCropDetail(CropDetail cropDetail) {
		cropDetailDao.save(cropDetail);
		return cropDetail;
	}

	@Override
	public CropDetail updateCropDetail(CropDetail cropDetail) {
		cropDetailDao.save(cropDetail);
		return cropDetail;
	}

	@Override
	public void deleteCropDetail(Long id) {
		CropDetail entity=cropDetailDao.findById(id).get();
		cropDetailDao.delete(entity);
	}

	@Override
	public List<CropDetail> getCropDetailByUser(Long id) {
		return cropDetailDao.findAllByUser(id);
	}

}
