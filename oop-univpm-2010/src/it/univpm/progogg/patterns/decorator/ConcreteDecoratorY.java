package it.univpm.progogg.patterns.decorator;

public class ConcreteDecoratorY extends Decorator {

	protected ConcreteDecoratorY(Component c) {
		super(c);
	}
	
	@Override
	public void doSomething() {
		System.out.println("something Y before");
		super.doSomething();
		System.out.println("somethng Y after");
	}
	
}