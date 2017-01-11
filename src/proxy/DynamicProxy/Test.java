package proxy.DynamicProxy;

import java.lang.reflect.Proxy;

public class Test {
	
	public static void main(String[] args) {
		Flyable f = new Bird();
		Runnable r = new Man();
		
		TimeInvocationHandler timeF = new TimeInvocationHandler(f);
		TimeInvocationHandler timeR = new TimeInvocationHandler(r);
		
		Flyable fProxy = (Flyable) Proxy.newProxyInstance(f.getClass().getClassLoader(), 
								f.getClass().getInterfaces(), timeF);
		
		LogInvocationHandler log = new LogInvocationHandler(fProxy);
		
		Flyable flogProxy = (Flyable) Proxy.newProxyInstance(fProxy.getClass().getClassLoader(), 
				fProxy.getClass().getInterfaces(), log);
		fProxy.fly();
		System.out.println("**************");
		flogProxy.fly();
		System.out.println("**************");
		
		Runnable rProxy = (Runnable)Proxy.newProxyInstance(r.getClass().getClassLoader(), 
				r.getClass().getInterfaces(), timeR);
		rProxy.run();
	}
}
