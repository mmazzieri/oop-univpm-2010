package it.univpm.progogg.concurrency;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class SquarerTask implements Callable<Integer> {
	
	private int number;
	
	public SquarerTask(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		try {
			for (int i = 10; i >= 1; i--) {
				System.out.println(i);
				TimeUnit.SECONDS.sleep(1);
			}
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
		return number * number;
	}
	
}

public class BasicCalls {

	public static void main(String[] args) {
		ExecutorService es  = Executors.newCachedThreadPool();
		ArrayList<Future<Integer>> results = new ArrayList<Future<Integer>>();
		for (int i = 1; i<= 10; i++)
			results.add(es.submit(new SquarerTask(i)));
		for(Future<Integer> f : results) {
			try {
				System.out.println(f.get());
			} catch (InterruptedException e) {
				System.out.println("interrupted");
			} catch (ExecutionException e) {
				System.out.println("task threw an exception");
			}
		}
	}
}
