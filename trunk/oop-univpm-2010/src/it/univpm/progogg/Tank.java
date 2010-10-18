package it.univpm.progogg;

public class Tank {
	private int level;
	
	  public static void fill(Tank t) {
	    t.level++;
	  }
	  
	public static void main(String[] args) {
		Tank t1 = new Tank();
	    t1.level = 9;
	    Tank t2 = new Tank();
	    t2.level = 12;
	    t1 = t2;	
	    System.out.println(t1.level);
	    t1.level = 42;	

	    // aliasing due to assignment
	    System.out.println(t2.level);

	    Tank t3 = new Tank();
	    t3.level = 3;
	    Tank.fill(t3);

	    // aliasing due to method call
	    System.out.println(t3.level);
	}

}