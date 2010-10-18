package it.univpm.progogg;

public class Spoon {
	public static int i;
	
	public int j;
	
	static {
		System.out.println("static block");
		i = 3;
	}
	
	public Spoon(int val) {
		System.out.println("constructor");
		j = val;
	}
}
