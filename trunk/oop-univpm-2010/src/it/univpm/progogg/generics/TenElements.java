package it.univpm.progogg.generics;

public class TenElements<T> {

	@SuppressWarnings("unchecked")
	T[] items = (T[])new Object[10];
	
	public T get(int index) {
		if (index < 0 || index >= 10)
			throw new ArrayIndexOutOfBoundsException();
		return items[index];
	}
	
	public void set(T item, int index) {
		if (index < 0 || index >= 10)
			throw new ArrayIndexOutOfBoundsException();
		items[index] = item;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
