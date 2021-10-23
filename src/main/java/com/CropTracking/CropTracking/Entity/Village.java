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
@Table(name="village")
public class Village {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="villageid_pk")
	private Long id;
	
	@Column(name="villagename")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="tehsilid_fk")
	private Tehsil tehsil;
	
	public Village() {}

	public Village(Long id, String name, Tehsil tehsil) {
		super();
		this.id = id;
		this.name = name;
		this.tehsil = tehsil;
	}
	

}
