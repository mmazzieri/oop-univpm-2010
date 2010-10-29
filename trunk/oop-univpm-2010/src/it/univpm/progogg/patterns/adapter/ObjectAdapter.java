package it.univpm.progogg.patterns.adapter;

public class ObjectAdapter implements Target {
	private Adaptee adaptee;
	
	public ObjectAdapter(Adaptee a) {
		adaptee = a;
	}
	
	public void Request() {
		adaptee.SpecificRequest();
	}
}
