package it.univpm.progogg;

public class VirtualMethodCallInConstructor {
	
	public int getNameLenght() {
		return 0;
	}
	
	public VirtualMethodCallInConstructor() {
		System.out.println("initial lenght is " + getNameLenght());
	}
	
	public static void main(String[] args) {
		new Derived("me");
	}
}

class Derived extends VirtualMethodCallInConstructor {
	String name;
	
	public Derived(String name) {
		this.name = name;
	}
	
	@Override
	public int getNameLenght() {
		return name.length();
	}
}
