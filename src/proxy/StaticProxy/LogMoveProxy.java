package proxy.StaticProxy;

public class LogMoveProxy implements Moveable {
	
	Moveable target;
	
	public LogMoveProxy(Moveable target){
		this.target = target;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Log代理额外执行动作");
		target.move();
		System.out.println("Log代理结束");
	}

}
