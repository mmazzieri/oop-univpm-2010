package it.univpm.progogg.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridOfButtons {
	public static void main(String[] args) {
		JFrame frame = new JFrame("A grid of buttons");
		frame.setLayout(new GridLayout(3, 4));
		for (int i = 1; i <= 10; i++)
			frame.add(new JButton("Button " + i));		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
