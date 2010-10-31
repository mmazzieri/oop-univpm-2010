package it.univpm.progogg.patterns.decorator;

public abstract class Decorator implements Component {
	private Component component;
	
	protected Decorator(Component c) {
		this.component = c;
	}
	
	@Override
	public void doSomething() {
		component.doSomething();
	}
	
	public static void main(String[] args) {
		Component c = new ConcreteDecoratorX(new ConcreteDecoratorY(new ConcreteComponent()));
		c.doSomething();
	}
}
