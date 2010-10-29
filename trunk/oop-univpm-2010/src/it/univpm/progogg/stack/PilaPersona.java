package it.univpm.progogg.stack;

import it.univpm.progogg.Employee;
import it.univpm.progogg.Person;
import it.univpm.progogg.Worker;

public class PilaPersona {
	Person[] array;
	int current;
	
	public PilaPersona(int dimension) {
		array = new Person[dimension];
		current = -1;
	}
	
	public void push(Person val) {
		array[++current] = val;
	}
	
	public Person peek() {
		return array[current];
	}
	
	public Person pop() {
		return array[current--];
	}
	
	public boolean isEmpty() {
		return current == -1;
	}
	
	public int size() {
		return current + 1;
	}
	
	public boolean isFull() {
		return current == array.length - 1;
	}
	
	public static void main(String[] args) {
		PilaPersona p = new PilaPersona(10);
		for (int i = 0; i < 5; i++)
			p.push(new Worker("Lavoratore numero " + i));
		//p.push(new Employee("Mario"));
		
		for (int i = 0; i < 5; i++){
			Worker w = (Worker) p.pop();
			System.out.println(w);
			w.fabbricaPezzo();
		}
			
		
			
	}
}
