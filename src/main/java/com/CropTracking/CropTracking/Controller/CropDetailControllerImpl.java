package com.CropTracking.CropTracking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.CropTracking.CropTracking.Entity.CropDetail;
import com.CropTracking.CropTracking.Service.ICropDetailService;

@RestController
public class CropDetailControllerImpl implements ICropDetailController{

	@Autowired
	private ICropDetailService cropDetailService;
	
	@Override
	public List<CropDetail> getCropdetails() {
		return this.cropDetailService.getCropDetail();
	}

	@Override
	public CropDetail getCropdetail(String id) {
		return this.cropDetailService.getCropDetail(Long.parseLong(id));
	}

	@Override
	public CropDetail addCropdetail(CropDetail cropdetail) {
		return this.cropDetailService.addCropDetail(cropdetail);
	}

	@Override
	public CropDetail updateCropdetail(CropDetail cropdetail) {
		return this.cropDetailService.updateCropDetail(cropdetail);
	}

	@Override
	public ResponseEntity<HttpStatus> deleteCropdetail(String id) {
		try {
			this.cropDetailService.deleteCropDetail(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public List<CropDetail> getCropDetailByUser(Long userId) {
		return cropDetailService.getCropDetailByUser(userId);
	}

}
