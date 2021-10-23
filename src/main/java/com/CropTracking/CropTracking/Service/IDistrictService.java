package com.CropTracking.CropTracking.Service;

import java.util.List;

import com.CropTracking.CropTracking.Entity.District;

public interface IDistrictService {

	public List<District> getDistrict();
	public District getDistrict(Long id);
	public District addDistrict(District district);
	public District updateDistrict(District district);
	public void deleteDistrict(Long id);
	public List<District> getDistrictByState(Long id);
}
