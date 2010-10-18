package it.univpm.progogg;

import java.util.ArrayList;
import java.util.List;

class Apple {
	static int counter;
	
	private int id;
	
	public Apple() {
		id = ++counter; 
	}
	
	@Override
	public String toString() {
		return "Apple " + id;
	}
}

public class AppleContainer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Apple> apples = new ArrayList<Apple>();
		for(int i = 0; i < 3; i++)
			apples.add(new Apple());
		
		// using size()
		for (int i = 0; i < apples.size(); i++)
			System.out.println(apples.get(i));
		
		// using "for each"
		for (Apple a : apples)
			System.out.println(a);
	}

}
