package com.CropTracking.CropTracking.Service;

import java.util.List;

import com.CropTracking.CropTracking.Entity.Village;

public interface IVillageService {

	public List<Village> getVillage();
	public Village getVillage(Long id);
	public Village addVillage(Village village);
	public Village updateVillage(Village village);
	public void deleteVillage(Long id);
	public List<Village> getVillageByTehsil(Long id);
}
