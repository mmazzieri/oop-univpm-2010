package it.univpm.progogg;

import javax.swing.JOptionPane;

public class SommaJOptionPane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String o1 = JOptionPane.showInputDialog("primo numero");
		String o2 = JOptionPane.showInputDialog("secondo numero");
		System.out.println(Integer.parseInt(o1) + Integer.parseInt(o2));
	}

}
