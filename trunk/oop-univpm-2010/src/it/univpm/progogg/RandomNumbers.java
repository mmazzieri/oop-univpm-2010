package it.univpm.progogg;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random r = new Random();
		int a = r.nextInt(9); // from 0 to 9
		float b = r.nextFloat(); // from 0 to 1
		System.out.println(a);
		System.out.println(b);
	}
}
