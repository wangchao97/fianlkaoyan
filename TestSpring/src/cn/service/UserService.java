package cn.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.dao.UserDao;

@Component("userService")
public class UserService {
	
	@Resource(name="userDao")
	private	UserDao userDao; //new UserDao();
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void save() {
		userDao.save();
	}
	
}
