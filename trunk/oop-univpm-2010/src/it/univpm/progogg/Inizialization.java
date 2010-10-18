package it.univpm.progogg;

public class Inizialization {
	public int i;
	
	public Inizialization(int val) {
		i = val;
	}
	
	public static void main(String[] args) {
		Inizialization i1 = new Inizialization(2);
		System.out.print(i1.i);
		i1.i = 3;
		System.out.println(i1.i);
	}
}
