package it.univpm.progogg.concurrency;

/**
 * A mailbox holding a single message
 * @author Mauro Mazzieri
 *
 */
public class BrickMail {
	private String message;
	
	public synchronized String get() throws InterruptedException {
		while(message == null)
			wait();
		notify();
		return message;
	}
	
	public synchronized void set(String m) throws InterruptedException {
		while(message != null)
			wait();
		message = m;
		notify();
	}

}
