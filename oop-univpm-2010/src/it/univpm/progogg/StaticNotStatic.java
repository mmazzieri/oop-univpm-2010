package it.univpm.progogg;

public class StaticNotStatic {
	private float x;
	private float y;
	
	public StaticNotStatic(float x1, float x2) {
		x = x1;
		y = x2;
	}
	
	public void printNotStatic() {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void printStatic(StaticNotStatic s) {
		System.out.println(s.x);
		System.out.println(s.y);
	}
}
