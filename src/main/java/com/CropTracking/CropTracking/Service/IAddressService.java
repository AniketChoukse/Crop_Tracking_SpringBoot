package com.CropTracking.CropTracking.Service;

import java.util.List;

import com.CropTracking.CropTracking.Entity.Address;

public interface IAddressService {

	public List<Address> getAddress();
	
	public Address getAddress(long id);
	
	public Address addAddress(Address address);
	
	public Address updateAddress(Address address);
	
	public void deleteAddress(long id);
	
	public Address getAddressByUser(Long id);
}
