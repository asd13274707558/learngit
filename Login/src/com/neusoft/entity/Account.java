package com.neusoft.entity;

import java.io.Serializable;

public class Account  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6301075639694428811L;
	/**
	 * µÇÂ¼ÓÃ»§Ãû
	 * */
	 private String username;
	 /**
	  * µÇÂ¼ÃÜÂë
	  * */
	 private String password;
	 	
	 
	 
	 public Account() {
			super();
		}
		
	 public Account(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}

	@Override
	public String toString() {
		return "username=" + username + ", password=" + password ;
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
		
	
	
}
