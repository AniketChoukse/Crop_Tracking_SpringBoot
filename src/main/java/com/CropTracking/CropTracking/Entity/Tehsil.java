package com.CropTracking.CropTracking.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
@Table(name="tehsil")
public class Tehsil {
	public Tehsil(Long id, String name, District district) {
		super();
		this.id = id;
		this.name = name;
		this.district = district;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="tehsilid_pk")
	private Long id;
	
	@Column(name="name")
	private String name;

	@ManyToOne
	@JoinColumn(name="districtid_fk")
	private District district;
	
	public Tehsil() {}
	
	
}
