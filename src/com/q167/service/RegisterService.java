package com.q167.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.q167.dao.UserDao;
import com.q167.pojo.User;

@Component("registerService")
public class RegisterService {
	
	@Autowired
	private UserDao userDao;
	
	public boolean register(String username, String password, String email) {
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setCreateTime(new Date());
		userDao.save(user);
		
		return true;
	}
}
