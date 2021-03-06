package com.mnd.gunreview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnd.gunreview.dao.UserDAO;
import com.mnd.gunreview.dto.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDao;
	
	@Override
	public List<User> selectUser() {
		return userDao.selectUser();
	}

	@Override
	public User selectUserByUserid(String userid) {
		return userDao.selectUserByUserid(userid);
	}

	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public int deleteUser(String userid) {
		return userDao.deleteUser(userid);
	}

}
