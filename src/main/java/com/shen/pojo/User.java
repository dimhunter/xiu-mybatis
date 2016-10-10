package com.shen.pojo;

import java.io.Serializable;

/**
 * 
 * 
 * 
 * @author shen
 *
 */
public class User implements Serializable {
	
	private static final long serialVersionUID = -3285671668731446152L;
	
	private String id;
	
	private String username;
	
	private String password;
	
	private int age;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
