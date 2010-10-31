package it.univpm.progogg.patterns.decorator;

public class ConcreteDecoratorX extends Decorator {

	protected ConcreteDecoratorX(Component c) {
		super(c);
	}
	
	@Override
	public void doSomething() {
		System.out.println("something X before");
		super.doSomething();
		System.out.println("somethng X after");
	}
	
}
