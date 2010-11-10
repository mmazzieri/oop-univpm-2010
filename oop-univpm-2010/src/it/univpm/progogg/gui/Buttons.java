package it.univpm.progogg.gui;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class Buttons extends JFrame {

	private static final long serialVersionUID = 1L;
	public Buttons() {
		setLayout(new FlowLayout());
		ButtonGroup bg = new ButtonGroup();
		JButton button = new JButton("JButton");
		add(button);
		JToggleButton tb = new JToggleButton("JToggleButton");
		add(tb);
		bg.add(tb);
		add(new JCheckBox("JCheckBox"));
		for (int i = 1; i <=4; i++) {
			JRadioButton radio = new JRadioButton("JRadioButton " + i);
			bg.add(radio);
			add(radio);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Buttons();
	}
}
