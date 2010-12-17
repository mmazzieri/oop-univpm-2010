package it.univpm.progogg.concurrency;

public class HelloRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello, Runnable!");
	}

	public static void main(String[] args) {
		HelloRunnable runnable = new HelloRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
