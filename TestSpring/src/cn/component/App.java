package cn.component;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.action.UserAction;


public class App  {
	
	@Test
	public void test() {
		ApplicationContext ac =  new ClassPathXmlApplicationContext("cn/component/bean.xml");
//		User u1 = (User) ac.getBean("user");
//		System.out.println(u1);
//		UserAction userAction = (UserAction) ac.getBean("userAction");
//		userAction.excute();
		User user = (User) ac.getBean("user");
		System.out.println(user.getClass());
	}	
	@Test
	public void test_p(){
		ApplicationContext ac =  new ClassPathXmlApplicationContext("cn/ObjectRelation/bean_p.xml");
		UserAction userAction = (UserAction) ac.getBean("userAction");
		userAction.excute();
		
		User user = (User) ac.getBean("user");  
		System.out.println(user.getName());
	}
}
