package com.CropTracking.CropTracking.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CropTracking.CropTracking.Entity.Address;
import com.CropTracking.CropTracking.Dao.IAddressDao;

@Service
public class AddressServiceImpl implements IAddressService{

	@Autowired
	private IAddressDao addressDao;
	
	
	
	@Override
	public List<Address> getAddress() {
		return addressDao.findAll();
	}

	@Override
	public Address getAddress(long id) {
		return addressDao.findById(id).get();	
		}
	
	@Override
	public Address addAddress(Address address) {
		addressDao.save(address);
		return address;
	}

	@Override
	public Address updateAddress(Address address) {
		
		Optional<Address> oldAdd = addressDao.findById(address.getId());
        if(oldAdd.isPresent()) 
        {
            Address newEntity = oldAdd.get();
            newEntity.setStateName(address.getStateName());
            newEntity.setDistrictName(address.getDistrictName());
            newEntity.setTehsilName(address.getTehsilName());
            newEntity.setVillageName(address.getVillageName());
            newEntity.setPincode(address.getPincode());
            newEntity = addressDao.save(newEntity);
            return newEntity;
        } else {
            address = addressDao.save(address);
             
            return address;
        }
		
		
	}

	@Override
	public void deleteAddress(long id) {
		Address entity=addressDao.findById(id).get();
		addressDao.delete(entity);
	}

	@Override
	public Address getAddressByUser(Long id) {
		return addressDao.findAddressByUser(id);
	}




	
}
