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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CropTracking.CropTracking.Entity.Tehsil;

@Controller
@RequestMapping("/tehsil")
@CrossOrigin("*")
public interface ITehsilController {

	@GetMapping("/getTehsil")
	public List<Tehsil> getTehsil();
	
	@GetMapping("/findById/{tehsilid_pk}")
	public Tehsil getTehsil(@PathVariable("tehsilid_pk") String id);
	
	@PostMapping("/save")
	public Tehsil addTehsil(@RequestBody Tehsil tehsil);
	
	@PostMapping("/update")
	public Tehsil updateTehsil(@RequestBody Tehsil tehsil);
	
	@DeleteMapping("/delete/{tehsilid_pk}")
	public ResponseEntity<HttpStatus> deleteTehsil(@PathVariable("tehsilid_pk") String id);
	
	@GetMapping("/findByDistrict")
	public List<Tehsil> getTehsilByDistrict(@RequestParam("districtId") Long districtId);
	}
