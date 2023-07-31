package com.technoelevate.mappingpractice.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="GirlFriend_info")
public class Girlfriend {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int girlFriendNo;
	@Id
	private String girlFriendName;
	private String girlFriendYear;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<BoyFriend> boyFriends;
	public Girlfriend() {}
	public Girlfriend( String girlFriendName, String girlFriendYear) {
		this.girlFriendName = girlFriendName;
		this.girlFriendYear = girlFriendYear;
	}
	public int getGirlFriendNo() {
		return girlFriendNo;
	}
	public void setGirlFriendNo(int girlFriendNo) {
		this.girlFriendNo = girlFriendNo;
	}
	public String getGirlFriendName() {
		return girlFriendName;
	}
	public void setGirlFriendName(String girlFriendName) {
		this.girlFriendName = girlFriendName;
	}
	public String getGirlFriendYear() {
		return girlFriendYear;
	}
	public void setGirlFriendYear(String girlFriendYear) {
		this.girlFriendYear = girlFriendYear;
	}
	public List<BoyFriend> getBoyFriends() {
		return boyFriends;
	}
	public void setBoyFriends(List<BoyFriend> boyFriends) {
		this.boyFriends = boyFriends;
	}
	
}
