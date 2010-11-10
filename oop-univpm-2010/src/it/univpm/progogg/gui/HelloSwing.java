package it.univpm.progogg.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloSwing {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello, Swing!");
		JLabel label = new JLabel("Hello from the Swing Graphical User Interface. ");
		frame.add(label);
		JButton button = new JButton("click me");
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 100);
		frame.setVisible(true);
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			label.setText(label.getText() + "I was interrupted before another greeting. ");
//		}
//		label.setText(label.getText() + "Nice to meet you.");
	}

}
