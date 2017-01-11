package decorator;

public class Run {
	public static void main(String[] args) {
		Component c = new ConcreteComponent();
		ConcreteDecoratorA a = new ConcreteDecoratorA(c);
		a.display();
		for(String temp:args){
			System.out.println(temp);
		}
	}
	
}
