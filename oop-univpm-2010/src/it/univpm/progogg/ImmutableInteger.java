package it.univpm.progogg;

public class ImmutableInteger {
	private int i;
	
	public ImmutableInteger(int i) {
		this.i = i;
	}
	
	public static ImmutableInteger add(ImmutableInteger i1, ImmutableInteger i2) {
		return new ImmutableInteger(i1.i + i2.i);
	}
}
