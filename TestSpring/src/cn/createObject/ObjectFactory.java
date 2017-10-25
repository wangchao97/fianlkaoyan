package cn.createObject;

public class ObjectFactory {
	
	
	//实例方法创建对象
	public User getInstance() {
		return new User(20, "工厂：调用实例方法");
	}
	
	public static User getStaticInstance() {
		return new User(100, "工厂：调用静态实例方法");
	}
}
