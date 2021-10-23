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
import com.CropTracking.CropTracking.Entity.Village;

@Controller
@RequestMapping("/village")
@CrossOrigin("*")
public interface IVillageController {
	
	@GetMapping("getVillage")
	public List<Village> getVillage();
	
	@GetMapping("/findById/{villageid_pk}")
public Village getVillage(@PathVariable("villageid_pk") String id);
	
	@PostMapping("/save")
	public Village addVillage(@RequestBody Village village);
	
	@PostMapping("/update")
	public Village updatVillage(@RequestBody Village village);
	
	@DeleteMapping("/delete/{villageid_pk}")
	public ResponseEntity<HttpStatus> deleteVillage(@PathVariable("villageid_pk") String id);
	
	@GetMapping("/findByTehsil")
	public List<Village> getVillageByTehsil(@RequestParam("tehsilId") Long tehsilId);

}
