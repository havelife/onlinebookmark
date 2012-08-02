package com.q167.dao;

import org.springframework.stereotype.Component;

import com.q167.dao.base.GenericDao;
import com.q167.pojo.User;

@Component("userDao") 
public class UserDao extends GenericDao<User, Long>{
	public UserDao(){
		super();
		this.entityClass = User.class;
	}
}
