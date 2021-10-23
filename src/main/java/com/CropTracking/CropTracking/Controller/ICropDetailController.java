package com.CropTracking.CropTracking.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CropTracking.CropTracking.Entity.CropDetail;
import com.CropTracking.CropTracking.Entity.User;

@Controller
@RequestMapping("/cropdetail")
@CrossOrigin("*")
public interface ICropDetailController {
	
	@GetMapping("/getCropdetail")
	public List<CropDetail> getCropdetails();

	@GetMapping("/findById/{cropdetailid_pk}")
	public CropDetail getCropdetail(@PathVariable("cropdetailid_pk") String id);

	@PostMapping("/save")
	public CropDetail addCropdetail(@RequestBody CropDetail cropdetail);

	@PutMapping("/update")
	public CropDetail updateCropdetail(@RequestBody CropDetail cropdetail);

	@DeleteMapping("/delete/{cropdetailid_pk}")
	public ResponseEntity<HttpStatus> deleteCropdetail(@PathVariable("cropdetailid_pk") String id);

	@GetMapping("/findByUser")
	public List<CropDetail> getCropDetailByUser(@RequestParam("userId") Long userId);
}
