package com.technoelevate.maaping.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Person_Info")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personId;
	private String personName;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Mobile> personMobile;
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public List<Mobile> getPersonMobile() {
		return personMobile;
	}
	public void setPersonMobile(List<Mobile> personMobile) {
		this.personMobile = personMobile;
	}
	
}
