package it.univpm.progogg.enums;

import it.univpm.progogg.Doer;


public enum Doers implements Doer {
	ANTONIO, PASQUALE;

	@Override
	public void doSomething() {
		System.out.println(name() + " does something.");		
	}
	
}
