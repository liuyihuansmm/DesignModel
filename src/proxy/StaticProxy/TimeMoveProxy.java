package proxy.StaticProxy;

/**
 * 静态代理的弊端是只能代理实现某一接口的对象。
 * 比如说这里只能代理实现Moveable接口的对象
 * 如果我要给一个实现Singable接口的对象代理处理歌唱时间，则又得新建一个代理类：
 * public class TimeSingable implements Singable{
 * 		Singable target;
 * }
 * 动态代理则不需要，只需定义TimeProxy，不需要针对不同的接口再定义代理类(说的有点儿绕口了，不知道你懂起没有)
 * @author LYH
 *
 */
public class TimeMoveProxy implements Moveable {
	
	Moveable target;
	
	public TimeMoveProxy(Moveable target){
		this.target = target;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Time代理额外执行动作");
		target.move();
		System.out.println("Time代理结束");
	}

}
