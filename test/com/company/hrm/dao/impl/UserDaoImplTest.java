package com.company.hrm.dao.impl;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.company.hrm.dao.pojo.User;

public class UserDaoImplTest {
	static UserDaoImpl u;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		u = new UserDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testRegist() {
		User user = new  User();
		user.setUsername("123");
		user.setUserpassword("123");
		try {
			u.regist(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

}
