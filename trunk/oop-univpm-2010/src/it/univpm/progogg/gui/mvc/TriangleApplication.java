package it.univpm.progogg.gui.mvc;

import java.awt.FlowLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TriangleApplication extends JFrame {

	private static final long serialVersionUID = 1L;

	public TriangleApplication() {
		RightTriangle model = new RightTriangle(3, 4);
		TrianglePanel textView = new TrianglePanel(model);
		TriangleGraph graphicView = new TriangleGraph(model);
		try {
			new TriangleLogger(model);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "could not open the log file",
					"logger error", JOptionPane.WARNING_MESSAGE);
		}
		setLayout(new FlowLayout());
		add(graphicView);
		add(textView);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TriangleApplication();
	}

}
