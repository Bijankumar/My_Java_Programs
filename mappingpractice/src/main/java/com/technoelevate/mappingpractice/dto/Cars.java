package com.technoelevate.mappingpractice.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Car_info")
public class Cars {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carsNo;
	private String carsName;
	private String carsModel;
	@ManyToOne(cascade = CascadeType.ALL)
	private Owner owner;
	public Cars() {}
	public Cars(String carsName, String carsModel, Owner owner) {
		this.carsName = carsName;
		this.carsModel = carsModel;
		this.owner = owner;
	}
	public int getCarsNo() {
		return carsNo;
	}
	public void setCarsNo(int carsNo) {
		this.carsNo = carsNo;
	}
	public String getCarsName() {
		return carsName;
	}
	public void setCarsName(String carsName) {
		this.carsName = carsName;
	}
	public String getCarsModel() {
		return carsModel;
	}
	public void setCarsModel(String carsModel) {
		this.carsModel = carsModel;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
