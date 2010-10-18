package it.univpm.progogg;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public void whoAmI() {
		System.out.println("I don't know");
	}
	
	public static void main(String[] args) {
		Person[] equipe = { new Employee("Mario"), new Worker("Antonio"), new Person("Luigi")};
		for (Person p : equipe) {
			p.whoAmI();
			System.out.println(p);
		}
	}
}

class Employee extends Person {
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

class Worker extends Person {
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
}