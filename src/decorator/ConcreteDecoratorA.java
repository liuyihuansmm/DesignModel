package decorator;

public class ConcreteDecoratorA extends Decorator{
	Component component;
	
	public ConcreteDecoratorA(Component component){
		
		this.component = component;
	}

	public void display(){
		System.out.println("装饰器A的方法");
		component.display();
	}
}
