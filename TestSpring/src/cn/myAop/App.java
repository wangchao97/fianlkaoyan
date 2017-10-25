package cn.myAop;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	ApplicationContext ac = new ClassPathXmlApplicationContext("cn/myAop/bean.xml");
	@Resource
	Aop aop;
	@Test
	public void testapp(){
		
	
//		IUserDao userDao = (UserDao) ac.getBean("userDao");
		ProxyFactory proxy =  (ProxyFactory) ac.getBean("proxyFactory");
	
		IUserDao userDao = (IUserDao) ac.getBean("userDao_proxy");
		userDao.save();
	}

}
