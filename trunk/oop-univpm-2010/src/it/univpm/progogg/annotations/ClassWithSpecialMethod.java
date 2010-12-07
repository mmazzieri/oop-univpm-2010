package it.univpm.progogg.annotations;

public class ClassWithSpecialMethod {
	
	@Special
	public void doesntReallyMatters() {
		
	}
	
	public void foolingAround() {
		
	}
	
	@Special(howMuch = 10, why = "for many many reasons")
	public void aKindOfMagic() {
		
	}
}