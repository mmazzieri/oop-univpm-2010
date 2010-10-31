package it.univpm.progogg.patterns.decorator;

public class ConcreteComponent implements Component {

	@Override
	public void doSomething() {
		System.out.println("basic operation");		
	}

}
