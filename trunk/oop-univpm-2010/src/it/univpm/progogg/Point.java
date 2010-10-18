package it.univpm.progogg;

public class Point {
	private int x;
	private int y;
	private Color c;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		c = Color.WHITE;
	}
	
	public Point(int x, int y, Color c) {
		this(x, y);
		this.c = c;
	}
	
	public static void main(String[] args) {
		Color c = Color.RED;
		System.out.println(c); // prints RED
		Color[] colors = Color.values();
		System.out.println(c.ordinal()); // print 1
	}
}
