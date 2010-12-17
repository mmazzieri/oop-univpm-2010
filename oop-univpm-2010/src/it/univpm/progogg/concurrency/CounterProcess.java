package it.univpm.progogg.concurrency;

public class CounterProcess extends Thread {
	SynchronizedCounter c;
	CountOperation o;

	public CounterProcess(SynchronizedCounter c, CountOperation o) {
		this.c = c;
		this.o = o;
	}

	@Override
	public void run() {
		while (true) {
			c.count(o);
		}
	}
	
	private final static int NP = 30;
	
	public static void main(String[] args) {
		SynchronizedCounter c = new SynchronizedCounter();
		CounterProcess[] p = new CounterProcess[NP];
		for (int i = 0; i < NP/2; i++)
			p[i] = new CounterProcess(c, CountOperation.INCREMENT);
		for (int i = NP/2; i < NP; i++)
			p[i] = new CounterProcess(c, CountOperation.DECREMENT);
		for(int i = 0; i < NP; i++)
			p[i].start();
		
	}
}
