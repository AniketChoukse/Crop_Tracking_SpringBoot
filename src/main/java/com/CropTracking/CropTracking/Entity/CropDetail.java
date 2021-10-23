package com.CropTracking.CropTracking.Entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name="cropdetail")
public class CropDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cropdetailid_pk")
	private Long id;
	
	@Column(name = "fieldname")
	private String fieldName;
	
	@Column(name = "cropname")
	private String cropName;
	
	@Column(name="cropdate")
	private Timestamp cropDate;
	
	@Column(name = "area")
	private String area;
	
	@Column(name = "seedquantity")
	private Integer seedQuantity;
	
	@Column(name = "pesticidename")
	private String pesticideName;
	
	@Column(name = "pesticidebrand")
	private String pesticideBrand;
	
	@Column(name = "pesticidedate")
	private Timestamp pesticideDate;
	
	@Column(name = "pesticidequantity")
	private Integer pesticideQuantity;
	
	@Column(name = "micronutrientname")
	private String microName;
	
	@Column(name = "micronutrientbrand")
	private String microBrand;
	
	@Column(name = "micronutrientdate")
	private Timestamp microDate;
	
	@Column(name = "micronutrientquantity")
	private Integer microQuantity;
	
	@Column(name = "cropdetailoutput")
	private String output;
	
//	@ManyToOne
//	@JoinColumn(name = "userid_fk")
//	private User user;
	
	@Column(name = "userid_fk")
	private Long userid_fk;

//	public Long getUserId() {
//		return userid_fk;
//	}
//	
//	public String getSample() {
//		return "Hello";
//	}
	
	public CropDetail() {
		super();
	}

	public CropDetail(Long id, String fieldName, String cropName,Timestamp cropDate, String area, Integer seedQuantity,
			String pesticideName, String pesticideBrand, Timestamp pesticideDate, Integer pesticideQuantity,
			String microName, String microBrand, Timestamp microDate, Integer microQuantity, String output,Long userid_fk) {
		super();
		this.id = id;
		this.fieldName = fieldName;
		this.cropName = cropName;
		this.cropDate=cropDate;
		this.area = area;
		this.seedQuantity = seedQuantity;
		this.pesticideName = pesticideName;
		this.pesticideBrand = pesticideBrand;
		this.pesticideDate = pesticideDate;
		this.pesticideQuantity = pesticideQuantity;
		this.microName = microName;
		this.microBrand = microBrand;
		this.microDate = microDate;
		this.microQuantity = microQuantity;
		this.output = output;
		this.userid_fk=userid_fk;
	}

	
}
