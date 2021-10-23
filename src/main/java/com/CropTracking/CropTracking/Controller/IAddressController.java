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

import com.CropTracking.CropTracking.Entity.Address;

@Controller
@RequestMapping("/address")
@CrossOrigin("*")
public interface IAddressController {

	@GetMapping("/getAddress")
	public List<Address> getAddress();
	
	@GetMapping("/findById/{addressid_pk}")
	public Address getAddress(@PathVariable("addressid_pk") String id);
	
	@PostMapping("/save")
	public Address addAddress(@RequestBody Address address);
	
	@PutMapping("/update")
	public Address updateAddress(@RequestBody Address address);
	
	@DeleteMapping("/delete/{addressid_pk}")
	public ResponseEntity<HttpStatus> deleteAddress(@PathVariable("addressid_pk") String id);
	
	@GetMapping("/findAddressByUser")
	public Address getAddressByUser(@RequestParam("userId") Long userId);
}
