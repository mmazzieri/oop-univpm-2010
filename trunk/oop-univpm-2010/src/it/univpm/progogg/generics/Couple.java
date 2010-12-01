package it.univpm.progogg.generics;

import java.util.ArrayList;

import it.univpm.progogg.Employee;
import it.univpm.progogg.Person;

/**
 * A couple of elements of the same type.
 * @author Mauro Mazzieri
 *
 * @param <T> The type of the contained item.
 */
public class Couple<T> {

	T first;
	
	T second;
	
	public Couple(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	@Override
	public String toString() {
		return "[" + first.toString() + ", " + second.toString() + "]";
	}
	
	public static <C> void printTypeName(C c) {
		System.out.println(c.getClass().getName());
	}
	
	
	public static void main(String[] args) {
		Couple<Person> cp = new Couple<Person>(new Person("Mario"), new Employee("Luigi"));
		System.out.println(cp);
		Couple<Integer> ci = new Couple<Integer>(1, 2);
		System.out.println(ci);
		Couple.printTypeName(cp);
		System.out.println(new ArrayList<Integer>().getClass().getName());
		System.out.println(new ArrayList<String>().getClass().getName());
	}

}
