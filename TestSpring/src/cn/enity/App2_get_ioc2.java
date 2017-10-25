package cn.enity;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App2_get_ioc2 {
	
	/**
	 * IOC创建的对象默认是单例对象
	 * scope="singleton"    [service/dao]
	 * 若要对象为多例
	 * scope="prototype"  [action]
	 */
		//2.(方便）直接得到IOC容器对象
		@Test
		public void Testac(){
			ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("cn/enity/applicationContext.xml");
		  
		  System.out.println("容器创建");
			//1.得到IOC容器对象
			//从容器中获取bean
			User user = (User) ac.getBean("user");
			User user1 = (User)ac.getBean("user");
			System.out.println(user);
			System.out.println(user1);
			ac.destroy();
		}
		 
}
