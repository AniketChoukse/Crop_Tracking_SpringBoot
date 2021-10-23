package com.CropTracking.CropTracking.Service;

import java.util.List;

import com.CropTracking.CropTracking.Entity.CropDetail;

public interface ICropDetailService {
	
	public List<CropDetail> getCropDetail();
	public CropDetail getCropDetail(Long id);
	public CropDetail addCropDetail(CropDetail cropDetail);
	public CropDetail updateCropDetail(CropDetail cropDetail);
	public void deleteCropDetail(Long id);
	public List<CropDetail> getCropDetailByUser(Long id);
}
