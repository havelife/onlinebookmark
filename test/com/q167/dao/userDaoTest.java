package com.q167.dao;

import java.util.Date;
import java.sql.Timestamp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.q167.pojo.User;



public class userDaoTest {
	private static ClassPathXmlApplicationContext ctx;
	private static UserDao userDao;
	
	@BeforeClass
	public static void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		userDao = (UserDao)ctx.getBean("userDao");
	}

	@AfterClass
	public static void tearDown() throws Exception {
		System.out.println("test completed!");
	}
	
	
	@Test
	public void saveTest(){
		User user = new User("name", "3232", "chenhuiting323@163.com", new Date());
		userDao.save(user);
	}
}
