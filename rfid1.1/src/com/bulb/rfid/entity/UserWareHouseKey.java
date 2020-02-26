package com.bulb.rfid.entity;

public class UserWareHouseKey {
    private User user;

    private WareHouse wareHouse;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public WareHouse getWareHouse() {
		return wareHouse;
	}

	public void setWareHouse(WareHouse wareHouse) {
		this.wareHouse = wareHouse;
	}

	@Override
	public String toString() {
		return "UserWareHouseKey [user=" + user + ", wareHouse=" + wareHouse + "]";
	}

   
}