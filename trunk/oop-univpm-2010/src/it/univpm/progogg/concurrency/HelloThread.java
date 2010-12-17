package it.univpm.progogg.concurrency;

public class HelloThread extends Thread {
	
	public HelloThread() {
		// TODO constructor
	}
	
	@Override
	public void run() {
		System.out.println("Hello, Thread!");
	}

	public static void main(String[] args) {
		HelloThread thread = new HelloThread();
		thread.start();
		
		// TODO rest of the program
	}

}
