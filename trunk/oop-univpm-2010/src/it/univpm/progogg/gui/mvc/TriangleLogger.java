package it.univpm.progogg.gui.mvc;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Observable;
import java.util.Observer;

public class TriangleLogger implements Observer {

	private RightTriangle model;
	private PrintWriter log;

	public TriangleLogger(RightTriangle model) throws IOException {
		this.model = model;
		model.addObserver(this);
		log = new PrintWriter(new FileWriter("triangle.log"));
		update(model, null);
	}

	@Override
	public void update(Observable source, Object o) {
		String message = "base=" + model.base() + ", height=" + model.height();
		log.println(message);
		System.out.println(message);
		log.flush();
	}

}
