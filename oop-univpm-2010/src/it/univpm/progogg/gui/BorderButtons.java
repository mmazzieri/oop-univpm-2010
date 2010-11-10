package it.univpm.progogg.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderButtons {

	public static void main(final String[] args) {
		JFrame frame = new JFrame("Buttons all around");
		JButton bn = new JButton("North");
		frame.add(BorderLayout.NORTH, bn);
		JButton bs = new JButton("South");
		frame.add(BorderLayout.SOUTH, bs);
		JButton be = new JButton("East");
		frame.add(BorderLayout.EAST, be);
		JButton bw = new JButton("West");
		frame.add(BorderLayout.WEST, bw);
		JButton bc = new JButton("Center");
		frame.add(BorderLayout.CENTER, bc);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		frame.setVisible(true);
	}

}
