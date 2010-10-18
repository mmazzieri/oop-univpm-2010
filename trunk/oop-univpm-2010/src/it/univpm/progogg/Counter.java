package it.univpm.progogg;

public class Counter {
	private int val;

	public Counter(int val) {
		this.val = val;
	}
	
	public boolean equals(Counter c2) {
		return val == c2.val;
	}

	public void reset() {
		val = 0;
	}

	public void inc() {
		++val;
	}

	public int getValue() {
		return val;
	}
}
