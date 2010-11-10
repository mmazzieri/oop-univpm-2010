package it.univpm.progogg.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextArea extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextArea area = new JTextArea(20, 40);
	private JButton addButton = new JButton("add");
	private JButton clearButton = new JButton("clear");

	public TextArea() {
		setLayout(new FlowLayout());
		add(new JScrollPane(area));
		
		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.append("The quick brow fox jumped over the lazy dog. \n");				
			}
			
		});
		add(addButton);
		
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText("");		
			}
			
		});
		add(clearButton);
		setSize(700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextArea();
	}
}
