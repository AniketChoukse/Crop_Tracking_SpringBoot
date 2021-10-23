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
import org.springframework.web.bind.annotation.ResponseBody;

import com.CropTracking.CropTracking.Entity.District;

@Controller
@RequestMapping("/district")
@CrossOrigin("*")
public interface IDistrictController {

	@GetMapping("/getDistrict")
	public List<District> getDistrict();
	
	@GetMapping("/findById/{districtid_pk}")
	public District getDistrict(@PathVariable("districtid_pk") String id);
	
	@PostMapping("/save")
	public District addDistrict(@RequestBody District district);
	
	
	@PutMapping("/update")
	public District updateDistrict(@RequestBody District district);
	
	@DeleteMapping("/delete/{districtid_pk}")
	public ResponseEntity<HttpStatus> deleteDistrict(@PathVariable("districtid_pk") String id);
	
	
	@GetMapping("/findByState")
	public List<District> getDistrictByState(@RequestParam("stateId") Long stateId);
}
