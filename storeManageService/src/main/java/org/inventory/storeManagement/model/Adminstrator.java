package org.inventory.storeManagement.model;

import javax.persistence.Entity;

@Entity
public class Adminstrator extends Staff{
	private String userName;
	private String password;

	public Adminstrator() {
	}
	
	
	public Adminstrator(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "Adminstrator [userName=" + userName + ", password=" + password + "]";
	}
}
