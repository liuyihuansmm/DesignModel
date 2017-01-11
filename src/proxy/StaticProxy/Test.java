package proxy.StaticProxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		Dog d = new Dog();
		System.out.println("==========");
		LogMoveProxy lProxy = new LogMoveProxy(c);
		lProxy.move();
		
		System.out.println("==========");
		TimeMoveProxy tProxy = new TimeMoveProxy(d);
		tProxy.move();
	}

}
