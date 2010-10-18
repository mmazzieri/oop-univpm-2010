package it.univpm.progogg.patterns.singleton;

public class Singleton {
	private static Singleton instance = new Singleton2();
	
//	static {
//		instance = new Singleton();
//	}
	
	protected Singleton() {		
	}
	
	public static Singleton getInstance() {
//		if (instance == null)
//			instance = new Singleton();
		return instance;
	}
	
	public void metodo1() {
	
	}
}

class Singleton1 extends Singleton {
}

class Singleton2 extends Singleton {
}
