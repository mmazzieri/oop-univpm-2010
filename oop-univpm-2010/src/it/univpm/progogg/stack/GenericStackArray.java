package it.univpm.progogg.stack;

import java.util.Random;

public class GenericStackArray<T> {
	Object[] array;
	int current;

	public GenericStackArray(int dimension) {
		// does not compile! (Java does not allow an array of generics)
		// array = new T[dimension];
		array = new Object[dimension];
		current = -1;
	}

	public void push(T val) {
		array[++current] = val;
	}

	@SuppressWarnings("unchecked")
	public T peek() {
		return (T) array[current];
	}

	@SuppressWarnings("unchecked")
	public T pop() {
		return (T) array[current--];
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
		GenericStackArray<Apple> apples = new GenericStackArray<Apple>(10);
		for (int i = 1; i <= 12; i++) {
			if (apples.isFull()) {
				System.out.println("stack full");
			} else {
				apples.push(new Apple("place " + i));
				System.out.println("pushed: " + apples.peek());
			}
		}

		System.out.println("apple stack size: " + apples.size());
		System.out.println("apple stack unrolling:");
		while (!apples.isEmpty()) {
			System.out.println(apples.pop());
		}

		GenericStackArray<Pear> pears = new GenericStackArray<Pear>(10);
		Random r = new Random();
		for (int i = 1; i <= 12; i++) {
			if (pears.isFull()) {
				System.out.println("stack full");
			} else {
				pears.push(new Pear(r.nextInt(10)));
				System.out.println("pushed: " + pears.peek());
			}
		}

		System.out.println("pear stack size: " + pears.size());
		System.out.println("pear stack unrolling:");
		while (!pears.isEmpty()) {
			System.out.println(pears.pop());
		}
	}
}
