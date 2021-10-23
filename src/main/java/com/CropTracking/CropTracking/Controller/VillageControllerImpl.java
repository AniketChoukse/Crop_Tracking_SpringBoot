package com.CropTracking.CropTracking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.CropTracking.CropTracking.Entity.Village;
import com.CropTracking.CropTracking.Service.IVillageService;

@RestController
public class VillageControllerImpl implements IVillageController{

	@Autowired
	private IVillageService villageService;
	
	@Override
	public List<Village> getVillage() {
		return this.villageService.getVillage();
	}

	@Override
	public Village getVillage(String id) {
		return this.villageService.getVillage(Long.parseLong(id));
	}

	@Override
	public Village addVillage(Village village) {
		return this.villageService.addVillage(village);
	}

	@Override
	public Village updatVillage(Village village) {
		return this.villageService.updateVillage(village);
	}

	@Override
	public ResponseEntity<HttpStatus> deleteVillage(String id) {
		try {
			this.villageService.deleteVillage(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public List<Village> getVillageByTehsil(Long tehsilId) {
		return villageService.getVillageByTehsil(tehsilId);
	}

}
