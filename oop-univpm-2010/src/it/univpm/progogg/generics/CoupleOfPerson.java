package it.univpm.progogg.generics;

import it.univpm.progogg.Employee;
import it.univpm.progogg.Person;

public class CoupleOfPerson<T extends Person> {

    T first;
	
	T second;
	
	public CoupleOfPerson(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public void printNames() {
		System.out.print("[");
		first.whoAmI();
		System.out.print(", ");
		second.whoAmI();
		System.out.print("]");
	}
	
	public static void main(String[] args) {
		CoupleOfPerson<Employee> cp = new CoupleOfPerson<Employee>(new Employee("Mario"), new Employee("Luigi"));
		cp.printNames();
	}

}
