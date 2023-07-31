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
@Table(name="tea_info")
public class Tea {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teaId;
	private String teaName;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Cups>listOfCups;
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	public List<Cups> getListOfCups() {
		return listOfCups;
	}
	public void setListOfCups(List<Cups> listOfCups) {
		this.listOfCups = listOfCups;
	}

}
