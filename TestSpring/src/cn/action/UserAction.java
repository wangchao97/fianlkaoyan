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
		int a=90;
		System.out.println("excuteִ��");
		userService.save();
		return null;
	}
}
