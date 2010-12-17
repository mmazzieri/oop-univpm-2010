package it.univpm.progogg.concurrency;

public class SynchronizedCounter {
	private int c;

	public synchronized void count(CountOperation o) {
		switch (o) {
		case INCREMENT:
			c++;
			System.out.println("Incremented; value: " + c);
			break;
		case DECREMENT:
			c--;
			System.out.println("Decremented; value: " + c);
			break;
		}
	}
}
