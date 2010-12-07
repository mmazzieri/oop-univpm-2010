package it.univpm.progogg.annotations;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class SpecialTracker {
	
	public static Method[] getSpecialMethods(Class<?> c) {
		ArrayList<Method> result = new ArrayList<Method>();
		for (Method m : c.getDeclaredMethods()) {
			Special s = m.getAnnotation(Special.class);
			if (s != null) {
				System.out.println("Method " + m.getName() + " of class " + c.getName() + " is special " + s.howMuch() + ": " + s.why());
				result.add(m);
			}
		}
		
		return result.toArray(new Method[0]);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class<?> c = ClassWithSpecialMethod.class;
		for (Method m : getSpecialMethods(c)) {
			System.out.println("Found special method " + m.getName() + " in class " + c.getName());
		}
	}

}
