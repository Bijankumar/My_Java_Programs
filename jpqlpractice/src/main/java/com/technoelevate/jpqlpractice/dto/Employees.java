package com.technoelevate.jpqlpractice.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="E_ID")
		private int employeeId;
	@Column(name="E_NAME")
	    private String employeeName;
	@Column(name="E_JOB")
	    private String employeeJobTitle;
	@Column(name="E_AGE")
	    private int employeeAge;
	@Column(name="E_YOP")
	    private int employeeYOP;
	@Column(name="E_SAL")
	    private double employeeSalary;
	public Employees() {}
	public Employees(String employeeName, String employeeJobTitle, int employeeAge, int employeeYOP,
			double employeeSalary) {
		this.employeeName = employeeName;
		this.employeeJobTitle = employeeJobTitle;
		this.employeeAge = employeeAge;
		this.employeeYOP = employeeYOP;
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeJobTitle() {
		return employeeJobTitle;
	}
	public void setEmployeeJobTitle(String employeeJobTitle) {
		this.employeeJobTitle = employeeJobTitle;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public int getEmployeeYOP() {
		return employeeYOP;
	}
	public void setEmployeeYOP(int employeeYOP) {
		this.employeeYOP = employeeYOP;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeJobTitle="
				+ employeeJobTitle + ", employeeAge=" + employeeAge + ", employeeYOP=" + employeeYOP
				+ ", employeeSalary=" + employeeSalary + "]";
	}
	
}
