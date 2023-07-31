package com.technoelevate.mappingpractice.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Country")
public class Country {
	@Id
	private String countryId;
	private String countryName;
	private String countryLanguage;
	@OneToOne(cascade = CascadeType.ALL)
	private PrimeMinister minister;
	public Country() {}
	public Country(String countryId, String countryName, String countryLanguage) {
		this.countryId = countryId;
		this.countryName = countryName;
		this.countryLanguage = countryLanguage;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryLanguage() {
		return countryLanguage;
	}
	public void setCountryLanguage(String countryLanguage) {
		this.countryLanguage = countryLanguage;
	}
	public PrimeMinister getMinister() {
		return minister;
	}
	public void setMinister(PrimeMinister minister) {
		this.minister = minister;
	}
	
}
