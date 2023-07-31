package com.technoelevate.mappingpractice.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BoyFriend_info")
public class BoyFriend {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int boyFriendNo;
	@Id
	private String boyFriendName;
	private String boyFriendYear;
	public BoyFriend() {}
	public int getBoyFriendNo() {
		return boyFriendNo;
	}
	public void setBoyFriendNo(int boyFriendNo) {
		this.boyFriendNo = boyFriendNo;
	}
	public String getBoyFriendName() {
		return boyFriendName;
	}
	public void setBoyFriendName(String boyFriendName) {
		this.boyFriendName = boyFriendName;
	}
	public String getBoyFriendYear() {
		return boyFriendYear;
	}
	public void setBoyFriendYear(String boyFriendYear) {
		this.boyFriendYear = boyFriendYear;
	}
	
	public BoyFriend(String boyFriendName, String boyFriendYear) {
		this.boyFriendName = boyFriendName;
		this.boyFriendYear = boyFriendYear;
	}
	
}
