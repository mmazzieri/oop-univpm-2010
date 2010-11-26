package it.univpm.progogg.tdd;

public class Factorials {
	public static long factorial(int n) {
		return n <= 1 ? 1 : n * factorial(n - 1);
	}
}
