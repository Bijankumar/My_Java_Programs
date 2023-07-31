package com.technoelevate.maaping.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Laptop_info")
public class Laptop {
	@Id
	private String laptopName;
	private String laptopColor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Student student;
	
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public String getLaptopColor() {
		return laptopColor;
	}
	public void setLaptopColor(String laptopColor) {
		this.laptopColor = laptopColor;
	}
	
	
}
