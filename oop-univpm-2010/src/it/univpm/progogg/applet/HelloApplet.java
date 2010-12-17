package it.univpm.progogg.applet;

import java.awt.EventQueue;

import javax.swing.JApplet;
import javax.swing.JLabel;

public class HelloApplet extends JApplet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				add(new JLabel("Hello, Applet!"));				
			}
		});
	}

}
