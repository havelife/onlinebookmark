package com.q167.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.q167.service.RegisterService;

public class RegisterAction extends ActionSupport{
	
	@Autowired
	RegisterService registerService;
	public String username;
	public String password;
	public String email;
	
	public String init(){
		System.out.println("RegisterAction.init()");
		return "input";
	}
	
	public String register(){
		registerService.register(username, password, email);
		System.out.println("RegisterAction.register()");
		return "success";
	}
	
	
	/*-------------get & set-------------*/

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
