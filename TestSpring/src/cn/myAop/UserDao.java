package cn.myAop;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.stereotype.Component;

@Component
public class UserDao implements IUserDao{
	
	
	@Override
	public void save() {
		
			System.out.println("-±£´æÊý¾Ý");
	}

	
}
