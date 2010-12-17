package it.univpm.progogg;

public class TryFinally {
	public static void throwsException() {
		System.out.println("method");
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("before");
			throwsException();
		} finally {
			System.out.println("finally");
		}
		System.out.println("end");
	}
}
