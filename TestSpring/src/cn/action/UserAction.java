package cn.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.service.UserService;

@Component("userAction")
public class UserAction {
	
	@Resource(name = "userService")
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String excute() {
		System.out.println("excute÷¥––");
		userService.save();
		return null;
	}
}
