package com.demo.model;

import javax.validation.constraints.*;

public class Users {

	@NotNull
	private int user_id;
	
	@Size(min=5,max=10)
	private String username;
	
	@Size(min=5,max=10)
	private String password;
	
	public Users() {
		super();
	}
	
	public Users(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String talkAboutYourself() {
		return "User_id:" +user_id + "Name: " +username;
	}

}
