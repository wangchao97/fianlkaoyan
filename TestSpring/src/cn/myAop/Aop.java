package cn.myAop;

import org.springframework.stereotype.Component;

@Component
public class Aop {
	public void begin() {
		System.out.println("开启事务");
	}
	public void commit() {
		System.out.println("提交事务");
	}
}
