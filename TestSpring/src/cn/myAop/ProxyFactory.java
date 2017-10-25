package cn.myAop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.stereotype.Component;

@Component
public class ProxyFactory {
	@Resource
	private Aop aop;
//	@Resource(name="userDao")
//	private Object target;	
		public Object GetProxyInstance(final Object target) {
		return	Proxy.newProxyInstance(
					target.getClass().getClassLoader(),
					target.getClass().getInterfaces(),
					new InvocationHandler() {						
						@Override
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							// TODO Auto-generated method stub
							//执行目标对象方法
							aop.begin();
							Object returnValue = method.invoke(target, args);
							aop.commit();
							return returnValue;
						}
					});
		}	
}
