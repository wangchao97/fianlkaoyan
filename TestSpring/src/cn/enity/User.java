package cn.enity;

public class User {
	private int id;
	private String name;
	
	public User() {
		// TODO Auto-generated constructor stub
		System.out.println("User创建");
	}
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void init_user() {
		System.out.println("初始化");
	}
	public void destory_user() {
		System.out.println("对象销毁");
	}
}
