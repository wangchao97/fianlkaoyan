package cn.createObject;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App  {
	
	@Test
	public void test() {
		ApplicationContext ac =  new ClassPathXmlApplicationContext("cn/test/bean.xml");
		User u1 = (User) ac.getBean("user");
		System.out.println(u1);
	}
		
		
}
