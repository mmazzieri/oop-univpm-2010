package it.univpm.progogg.patterns.adapter;

public class ClassAdapter extends Adaptee implements Target {
	public void Request() {
		SpecificRequest();
	}
}
