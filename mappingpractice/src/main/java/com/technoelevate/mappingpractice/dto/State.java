package com.technoelevate.mappingpractice.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="States")
public class State {
	@Id
	private String stateCode;
	private String stateName;
	@OneToMany(cascade = CascadeType.ALL)
	private List<District> districtList;
	public State() {}
	public State(String stateCode, String stateName, List<District> districtList) {
		this.stateCode = stateCode;
		this.stateName = stateName;
		this.districtList = districtList;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public List<District> getDistrictList() {
		return districtList;
	}
	public void setDistrictList(List<District> districtList) {
		this.districtList = districtList;
	}
}
