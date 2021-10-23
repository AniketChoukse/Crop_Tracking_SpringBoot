package com.CropTracking.CropTracking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.CropTracking.CropTracking.Entity.Tehsil;
import com.CropTracking.CropTracking.Service.ITehsilService;

@RestController
public class TehsilControllerImpl implements ITehsilController{

	@Autowired
	private ITehsilService tehsilService;
	
	@Override
	public List<Tehsil> getTehsil() {
		return this.tehsilService.getTehsil();
	}

	@Override
	public Tehsil getTehsil(String id) {
		return this.tehsilService.getTehsil(Long.parseLong(id));
	}

	@Override
	public Tehsil addTehsil(Tehsil tehsil) {
		return this.tehsilService.addTehsil(tehsil);
	}

	@Override
	public Tehsil updateTehsil(Tehsil tehsil) {
		return this.tehsilService.updateTehsil(tehsil);
	}

	@Override
	public ResponseEntity<HttpStatus> deleteTehsil(String id) {
		try {
			this.tehsilService.deleteTehsil(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public List<Tehsil> getTehsilByDistrict(Long districtId) {
		return tehsilService.getTehsilByDistrict(districtId);
	}

}
