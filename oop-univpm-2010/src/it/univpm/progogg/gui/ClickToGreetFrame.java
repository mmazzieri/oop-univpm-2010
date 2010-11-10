package it.univpm.progogg.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClickToGreetFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton[] buttons = new JButton[10];
	private JLabel label = new JLabel();

	class ButtonGreeterActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("Greetings from "
					+ ((JButton) e.getSource()).getText());
		}

	}

	public ClickToGreetFrame() {
		setLayout(new FlowLayout());
		ActionListener listener = new ButtonGreeterActionListener();
		for (int i = 0; i < 10; i++) {
			buttons[i] = new JButton("Button " + (i + 1));
			buttons[i].addActionListener(listener);
			add(buttons[i]);
		}
		
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		ClickToGreetFrame frame = new ClickToGreetFrame();
	}

}
