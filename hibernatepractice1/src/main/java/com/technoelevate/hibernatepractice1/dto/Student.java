package com.technoelevate.hibernatepractice1.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_info")
public class Student {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	private String studentSection;
	private String studentAddress;
	public Student() {}
	public Student( String studentName, String studentSection, String studentAddress) {
		this.studentName = studentName;
		this.studentSection = studentSection;
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSection=" + studentSection
				+ ", studentAddress=" + studentAddress + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentSection() {
		return studentSection;
	}
	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
}
