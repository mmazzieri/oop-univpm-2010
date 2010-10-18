package it.univpm.progogg.patterns.strategy;

public class Context {
	private Strategy strategy;
	
	public void doSomething() {
		// ..
		
		strategy.method1();
		
		// ..
	}
}
