package com.technoelevate.mappingpractice.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "District_info")
public class District {
	@Id
	private String districtName;
	private int districtPin;
	public District() {}
	public District(String districtName, int districtPin) {
		this.districtName = districtName;
		this.districtPin = districtPin;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public int getDistrictPin() {
		return districtPin;
	}
	public void setDistrictPin(int districtPin) {
		this.districtPin = districtPin;
	}
}
