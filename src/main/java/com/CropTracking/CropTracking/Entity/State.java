package com.CropTracking.CropTracking.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "state")
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="stateid_pk")
	private Long stateId;
	
	@Column(name="statename")
	private String stateName;
	
	public State() {}

	public Long getId() {
		return stateId;
	}

	public void setId(Long id) {
		this.stateId = id;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public State(Long id, String stateName) {
		super();
		this.stateId = id;
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "State [id=" + stateId + ", stateName=" + stateName + "]";
	};
	
	
	
}
