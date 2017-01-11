package proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogInvocationHandler implements InvocationHandler {
	
	Object target;
	
	public LogInvocationHandler(Object target){
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Log代理开始：xx年xx月xx日经行了log操作");
		Object o = method.invoke(target, args);
		Thread.sleep(2000);
		System.out.println("Log代理开始：**年**月**日结束了log操作");
		return o;
	}

}
