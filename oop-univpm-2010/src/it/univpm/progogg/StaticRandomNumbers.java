package it.univpm.progogg;

import java.util.Random;

public class StaticRandomNumbers {
	final static long globalSeed = new Random().nextLong();
	
	final long seed = globalSeed - new Random().nextInt(100);
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			StaticRandomNumbers rn = new StaticRandomNumbers();
			System.out.println("Global seed: " + StaticRandomNumbers.globalSeed + "; local seed: " + rn.seed);
		}
	}
}