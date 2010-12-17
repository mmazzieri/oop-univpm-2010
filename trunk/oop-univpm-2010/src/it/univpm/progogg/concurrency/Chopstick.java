package it.univpm.progogg.concurrency;

/**
 * A chopstick that can be taken by one philosopher.
 * Taking a single chopstick a time can cause a deadlock.
 * @author Mauro Mazzieri
 *
 */
public class Chopstick {
	private boolean taken = false;
	
	public synchronized void take() throws InterruptedException {
		while(taken)
			wait();
		taken = true;
	}
	
	public synchronized void drop() {
		taken = false;
		notifyAll();
	}
}
