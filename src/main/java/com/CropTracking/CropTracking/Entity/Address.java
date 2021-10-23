package com.CropTracking.CropTracking.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Table(name="address")
public class Address {

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getTehsilName() {
		return tehsilName;
	}

	public void setTehsilName(String tehsilName) {
		this.tehsilName = tehsilName;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public Long getUserid_fk() {
		return userid_fk;
	}

	public void setUserid_fk(Long userid_fk) {
		this.userid_fk = userid_fk;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="addressid_pk")
	private Long id;
	
	@Column(name="statename")
	private String stateName;
	
	@Column(name="districtname")
	private String districtName;
	
	@Column(name="tehsilname")
	private String tehsilName;
	
	@Column(name="villagename")
	private String villageName;
	
	@Column(name="pincode")
	private Long pincode;

	@Column(name="userid_fk")
	private Long userid_fk;
	
	
	
//	public Address(Long id, String stateName, String districtName, String tehsilName, String villageName,
//			Long pincode,Long userid_fk) {
//		super();
//		this.id = id;
//		this.stateName = stateName;
//		this.districtName = districtName;
//		this.tehsilName = tehsilName;
//		this.villageName = villageName;
//		this.pincode = pincode;
//		this.userid_fk=userid_fk;
//	}
	
	
}
