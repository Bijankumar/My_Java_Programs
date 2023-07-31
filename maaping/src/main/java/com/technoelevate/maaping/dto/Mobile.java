package com.technoelevate.maaping.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mobile_info")
public class Mobile {
	@Id
	private String mobileName;
	private String mobileColor;
	
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getMobileColor() {
		return mobileColor;
	}
	public void setMobileColor(String mobileColor) {
		this.mobileColor = mobileColor;
	}
	
}
