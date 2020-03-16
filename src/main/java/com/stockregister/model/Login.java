package com.stockregister.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Login {
	@SerializedName("userName")
	@Expose
	private String userName;
	@SerializedName("password")
	@Expose
	private String password;
	@SerializedName("rememberMe")
	@Expose
	private String rememberMe;
	
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
	public String getRememberMe() {
		return rememberMe;
	}
	public void setRememberMe(String rememberMe) {
		this.rememberMe = rememberMe;
	}

	
}
