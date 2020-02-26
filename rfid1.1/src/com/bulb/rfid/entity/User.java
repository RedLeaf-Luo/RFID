package com.bulb.rfid.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
   
	private static final long serialVersionUID = 1L;

	private String userId;

    private String userAccount;

    private String userPassword;

    private String userName;

    private String userPhone;

    private Date addTime;

    private Date time;
    
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public void setTime(Date time) {
		this.time = this.addTime;
	}

	public Date getTime() {
		return this.getAddTime();
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userAccount=" + userAccount + ", userPassword=" + userPassword
				+ ", userName=" + userName + ", userPhone=" + userPhone + ", addTime=" + addTime + ", time=" + time
				+ "]";
	}

	
}