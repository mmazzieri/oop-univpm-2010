package it.univpm.progogg.concurrency;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Philosopher implements Runnable {
	
	private String name;
	private Chopstick left;
	private Chopstick right;
	private Random r = new Random();
	
	public Philosopher(String name, Chopstick left, Chopstick right) {
		this.name = name;
		this.left = left;
		this.right = right;
	}

	@Override
	public void run() {
		while(!Thread.interrupted()) {
			System.out.println(name + " thinking");
			try {
				//TimeUnit.MILLISECONDS.sleep(r.nextInt(50));
				System.out.println(name + " grap left");
				left.take();
				System.out.println(name + " grap right");
				right.take();
				System.out.println(name + " eating");
				//TimeUnit.MILLISECONDS.sleep(r.nextInt(50));
				left.drop();
				right.drop();
			} catch (InterruptedException e) {
				System.out.println(name + " interrupted");
			}
			
		}
	}
	
	public static void main(String[] args) throws IOException {
		final int N = 5;
		
		ExecutorService executor = Executors.newCachedThreadPool();
		Chopstick[] sticks = new Chopstick[N];
		for (int i = 0; i < N; i++)
			sticks[i] = new Chopstick();
		for (int i = 0; i < N; i++)
			executor.execute(new Philosopher("Philosopher " + (i + 1), sticks[i], sticks[(i + 1) % N]));
		//for (int i = 0; i < N - 1; i++)
		//	executor.execute(new Philosopher("Philosopher " + (i + 1), sticks[i], sticks[i + 1]));
		//executor.execute(new Philosopher("Philosopher " + 5, sticks[0], sticks[4]));
		System.in.read();
		executor.shutdown();
	}

}
