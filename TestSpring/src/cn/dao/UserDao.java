package cn.dao;

import org.springframework.stereotype.Component;

//把当前对象加入ioc容器
@Component("userDao")
public class UserDao {

	public void save() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}



}
