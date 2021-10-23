package com.CropTracking.CropTracking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.CropTracking.CropTracking.Entity.Address;
import com.CropTracking.CropTracking.Service.IAddressService;

@RestController
public class AddressControllerImpl implements IAddressController{

	@Autowired
	private IAddressService addressService;

	@Override
	public List<Address> getAddress() {
		return this.addressService.getAddress();
	}

	@Override
	public Address getAddress(String id) {
		return this.addressService.getAddress(Long.parseLong(id));
	}

	@Override
	public Address addAddress(Address address) {
		return this.addressService.addAddress(address);
	}

	@Override
	public Address updateAddress(Address address) {
		return this.addressService.updateAddress(address);
	}

	@Override
	public ResponseEntity<HttpStatus> deleteAddress(String id) {
		try {
			this.addressService.deleteAddress(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public Address getAddressByUser(Long userId) {
		return this.addressService.getAddressByUser(userId);
	}

	
	
	
	
}
