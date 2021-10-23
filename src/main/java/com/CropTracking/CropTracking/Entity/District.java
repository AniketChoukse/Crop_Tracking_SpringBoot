package com.CropTracking.CropTracking.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="District")
public class District {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="districtid_pk")
	private Long id;
	
	@Column(name="districtname")
	private String districtName;
	
	@ManyToOne
	@JoinColumn(name="stateid_fk")    
	private State state;
	
	public District() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public District(Long id, String districtName, State state) {
		super();
		this.id = id;
		this.districtName = districtName;
		this.state = state;
	}

	@Override
	public String toString() {
		return "District [id=" + id + ", districtName=" + districtName + ", state=" + state + "]";
	};
	
}
