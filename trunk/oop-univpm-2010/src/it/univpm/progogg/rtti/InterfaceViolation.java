package it.univpm.progogg.rtti;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

interface I {
	void f();
}

class Impl implements I {
	public void f() {
		System.out.println("f");
	}

	public void g() {
		System.out.println("g");
	}
	
	private void h() {
		System.out.println("private h");
	}
}

public class InterfaceViolation {

	static void violator(I i) {
		i.f();
		if (i instanceof Impl) {
			Impl c = (Impl) i;
			c.g();
			
			// moreover...
			try {
				Method h = c.getClass().getDeclaredMethod("h");
				h.setAccessible(true);
				h.invoke(c);
			} catch (SecurityException e) {
				System.out.println("no permission to access method h()");
			} catch (NoSuchMethodException e) {
				System.out.println("method h() not found");
			} catch (IllegalArgumentException e) {
				System.out.println("illegal argumento for method h()");
			} catch (IllegalAccessException e) {
				System.out.println("illegal access to method h()");
			} catch (InvocationTargetException e) {
				System.out.println("error invoking method h()");
			}
			
		}
	}

	public static void main(String[] args) {
		I c = new Impl();
		violator(c);
	}
}
