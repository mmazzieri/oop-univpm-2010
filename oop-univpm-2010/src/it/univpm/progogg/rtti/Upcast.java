package it.univpm.progogg.rtti;

class A { }

class B extends A { }

class C extends A { }

public class Upcast {

	public static void main(String[] args) {
		A a = new B();
		B b = (B)a;
		C c = (C)a;
	}

}
