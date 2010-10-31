package it.univpm.progogg;

import java.io.Serializable;

public class Person implements Serializable {
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