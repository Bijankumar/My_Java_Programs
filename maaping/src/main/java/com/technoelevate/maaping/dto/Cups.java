package com.technoelevate.maaping.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cups_info")
public class Cups {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cupsId;
	private String cupsName;
	private String cupsColour;
	public int getCupsId() {
		return cupsId;
	}
	public void setCupsId(int cupsId) {
		this.cupsId = cupsId;
	}
	public String getCupsName() {
		return cupsName;
	}
	public void setCupsName(String cupsName) {
		this.cupsName = cupsName;
	}
	public String getCupsColour() {
		return cupsColour;
	}
	public void setCupsColour(String cupsColour) {
		this.cupsColour = cupsColour;
	}

}
