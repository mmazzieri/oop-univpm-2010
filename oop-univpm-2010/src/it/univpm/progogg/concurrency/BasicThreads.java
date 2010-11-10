package it.univpm.progogg.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class BasicTask implements Runnable {

	private String name;
	
	public BasicTask(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		// do something
		double d = 1.3;
		for (int i = 0; i <= 1000000000; i++)
			d = Math.exp(d);
		System.out.println(name + " value: " + d);
	}
	
}

class BasicCallable implements Callable<Double> {

	@Override
	public Double call() throws Exception {
		// TODO Auto-generated method stub
		double d = 1.3;
		for (int i = 0; i <= 1000000000; i++)
			d = Math.exp(d);
		return d;
	}
	
}

public class BasicThreads {
	
	public static void main(String[] args) {
		// very simple way to run a task: use a Thread to execute a Runnable
		Thread t = new Thread(new BasicTask("thread"));
		t.start();
		
		// more common way to run a task: use a suitable ExecutorService
		Executors.newSingleThreadExecutor().execute(new BasicTask("executor"));
		
		// a task returning a value is a Callable		
		Future<Double> result = Executors.newSingleThreadExecutor().submit(new BasicCallable());
		
		try {
			// blocked until the result is ready
			System.out.println("Call result: " + result.get());
		} catch (InterruptedException e) {
			System.err.println("interrupted");
		} catch (ExecutionException e) {
			System.err.println("execution error");
		}
	}
}
