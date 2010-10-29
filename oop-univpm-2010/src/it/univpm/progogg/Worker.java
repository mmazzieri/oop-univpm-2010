package it.univpm.progogg;

public class Worker extends Person {
	public Worker(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return "Worker " + super.toString();
	}
	
	@Override
	public void whoAmI() {
		System.out.println("I work in the factory");
	}
	
	public void fabbricaPezzo() {
		
	}
}