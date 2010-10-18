package it.univpm.progogg.patterns.state;

enum Stati {
	STATO1, STATO2
}

public class Context {
	private State stato;

	public void registra() {
		stato.registra();
//		switch (stato) {
//		case STATO1:
//			// ....
//			break;
//		case STATO2:
//			// ...
//			stato = Stati.STATO1;
//			break;
//		}
	}
}
