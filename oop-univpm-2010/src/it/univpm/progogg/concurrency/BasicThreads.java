package it.univpm.progogg.concurrency;

class BasicTask implements Runnable {

	@Override
	public void run() {
		// do something		
	}
	
}

public class BasicThreads {
	
	public void main(String[] args) {
		Thread t = new Thread(new BasicTask());
		t.start();
	}
}
