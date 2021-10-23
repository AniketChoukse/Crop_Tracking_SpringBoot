package com.CropTracking.CropTracking.Service;

import java.util.List;

import com.CropTracking.CropTracking.Entity.Tehsil;

public interface ITehsilService {

	public List<Tehsil> getTehsil();
	public Tehsil getTehsil(Long id);
	public Tehsil addTehsil(Tehsil tehsil);
	public Tehsil updateTehsil(Tehsil tehsil);
	public void deleteTehsil(Long id);
	public List<Tehsil> getTehsilByDistrict(Long id);
}
