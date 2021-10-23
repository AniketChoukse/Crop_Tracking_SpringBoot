package com.CropTracking.CropTracking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.CropTracking.CropTracking.Entity.District;
import com.CropTracking.CropTracking.Service.IDistrictService;

@RestController
public class DistrictControllerImpl implements IDistrictController{

	
	@Autowired
	private IDistrictService districtService;
	
	@Override
	public List<District> getDistrict() {
		return this.districtService.getDistrict();
	}

	@Override
	public District getDistrict(String id) {
		return this.districtService.getDistrict(Long.parseLong(id));
	}

	@Override
	public District addDistrict(District district) {
		return this.districtService.addDistrict(district);
	}

	@Override
	public District updateDistrict(District district) {
		return this.districtService.updateDistrict(district);
	}

	@Override
	public ResponseEntity<HttpStatus> deleteDistrict(String id) {
		try {
			this.districtService.deleteDistrict(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

//	@Override
//	public List<District> getDistrictByState(String stateId) {
//		return districtService.getDistrictByState(Long.parseLong(stateId));
//	}

	@Override
	public List<District> getDistrictByState(Long stateId) {
		return districtService.getDistrictByState((stateId));
	}

}
