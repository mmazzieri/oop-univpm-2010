package it.univpm.progogg;

interface I1 {
	void do1();
}

interface I2 {
	void do2();
}

interface I3 extends I1, I2 {
	void do3();
}

public class NestedInterfaces implements I3 {
	
	@Override
	public void do1() {
		System.out.println("first");
	}

	@Override
	public void do3() {
		System.out.println("second");		
	}

	@Override
	public void do2() {
		System.out.println("third");		
	}
}
