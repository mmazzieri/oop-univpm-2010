package it.univpm.progogg;

public class Employee extends Person {
	public Employee(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return "Employee " + super.toString();
	}
	
	@Override
	public void whoAmI() {
		System.out.println("I work in the office");
	}
}