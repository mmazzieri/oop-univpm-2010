package it.univpm.progogg.patterns.factorymethod;

public class Application1 extends Application {
	@Override
	public Document createDocument() {
		return new Document1();
	}
}
