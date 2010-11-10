package it.univpm.progogg.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowOfButtons {

	public static void main(String[] args) {
		JFrame frame = new JFrame("A flow of buttons");
		frame.setLayout(new FlowLayout());
		for (int i = 1; i <= 10; i++)
			frame.add(new JButton("Button " + i));		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}

}
