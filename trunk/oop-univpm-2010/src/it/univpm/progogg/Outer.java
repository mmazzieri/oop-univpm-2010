package it.univpm.progogg;

public class Outer {
	class Inner {
	}
	
	public Inner getInner() {
		return new Inner();
	}
	
	public static Inner getGenericInner() {
		Outer o = new Outer();
		return o.new Inner();
	}
	
	public static void main(String[] args) {
		Outer.Inner i = new Outer().getInner();
	}
}

class DerivedInner extends Outer.Inner {
	public DerivedInner(Outer o) {
		o.super();
	}
}
