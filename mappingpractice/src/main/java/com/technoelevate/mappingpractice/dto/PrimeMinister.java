package com.technoelevate.mappingpractice.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Prime_Minister")
public class PrimeMinister {
	@Id
	private String primeMinisterName;
	private int primeMinisterAge;
	private String primeMinisterAddress;
	public PrimeMinister() {}
	public PrimeMinister(String primeMinisterName, int primeMinisterAge, String primeMinisterAddress) {
		this.primeMinisterName = primeMinisterName;
		this.primeMinisterAge = primeMinisterAge;
		this.primeMinisterAddress = primeMinisterAddress;
	}
	public String getPrimeMinisterName() {
		return primeMinisterName;
	}
	public void setPrimeMinisterName(String primeMinisterName) {
		this.primeMinisterName = primeMinisterName;
	}
	public int getPrimeMinisterAge() {
		return primeMinisterAge;
	}
	public void setPrimeMinisterAge(int primeMinisterAge) {
		this.primeMinisterAge = primeMinisterAge;
	}
	public String getPrimeMinisterAddress() {
		return primeMinisterAddress;
	}
	public void setPrimeMinisterAddress(String primeMinisterAddress) {
		this.primeMinisterAddress = primeMinisterAddress;
	}
	
}
