package com.cts.payroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.payroll.bean.PayrollAppException;
import com.cts.payroll.bean.User;
import com.cts.payroll.dao.UserDao;

@Service
public class UserService {
	private UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Transactional
	public User getUser(String userName) throws PayrollAppException {
		System.out.println(userDao.getUser(userName));
		return userDao.getUser(userName);

	}

}
