package proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeInvocationHandler implements InvocationHandler {

	Object target;
	
	public TimeInvocationHandler(Object target){
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Time代理开始："+System.currentTimeMillis());
		Object o = method.invoke(target, args);
		Thread.sleep(2000);
		System.out.println("Time代理结束："+System.currentTimeMillis());
		return o;
	}

}
