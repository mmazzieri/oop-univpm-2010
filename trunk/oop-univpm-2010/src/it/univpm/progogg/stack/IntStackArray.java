package it.univpm.progogg.stack;

import java.util.Random;

public class IntStackArray {
	int[] array;
	int current;
	
	public IntStackArray(int dimension) {
		array = new int[dimension];
		current = -1;
	}
	
	public void push(int val) {
		array[++current] = val;
	}
	
	public int peek() {
		return array[current];
	}
	
	public int pop() {
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
	
	public static void main(String args[]) {
		IntStackArray a = new IntStackArray(10);
		Random r = new Random();
		for (int i = 1; i <= 12; i++) {
			if (a.isFull()) {
				System.out.println("stack full");
			}
			else {
				a.push(r.nextInt());
				System.out.println("pushed: " + a.peek());
			}
		}
		
		System.out.println("stack size: " + a.size());
		System.out.println("stack unrolling:");
		while(!a.isEmpty()) {
			System.out.println(a.pop());			
		}
	}
}
