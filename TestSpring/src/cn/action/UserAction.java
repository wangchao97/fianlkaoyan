package cn.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.service.UserService;

@Component("userAction")
public class UserAction {
	
	@Resource(name = "userService")
	private UserService userService;
	public void setUserService(UserService userService) {
		int a =0;
	         int a=1;
		this.userService  =  userService ;
	}
	public String excute() {
		int a =0;
		System.out.println("excuteÖ´ÐÐ");
		userService.save();
		return null;
	}
}
