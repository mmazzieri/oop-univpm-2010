package it.univpm.progogg.gui;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxesOfButtons {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Some buttons");
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		leftPanel.add(new JButton("Button 1"));
		leftPanel.add(new JButton("Button 2"));
		mainPanel.add(leftPanel);
		JPanel rightPanel = new JPanel();
		rightPanel.add(new JButton("Button 3"));
		mainPanel.add(rightPanel);
		frame.add(mainPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
