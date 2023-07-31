package com.technoelevate.mappingpractice.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Owner_info")
public class Owner {
	@Id
	private String ownerName;
	private int ownerAge;
	private String ownerAddress;
	public Owner() {}
	public Owner(String ownerName, int ownerAge, String ownerAddress) {
		this.ownerName = ownerName;
		this.ownerAge = ownerAge;
		this.ownerAddress = ownerAddress;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getOwnerAge() {
		return ownerAge;
	}
	public void setOwnerAge(int ownerAge) {
		this.ownerAge = ownerAge;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	
}
