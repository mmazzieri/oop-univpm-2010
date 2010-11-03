package it.univpm.progogg.concurrency;

import java.math.BigInteger;

import javax.swing.JOptionPane;

public class UnresponsiveUI {

	public static void main(String[] args) {
		BigInteger n1 = BigInteger.ONE;
		BigInteger n2 = BigInteger.ONE;
		BigInteger n3;
		for (int i = 0; i < 10000; i++) {
			n3 = n1.add(n2);
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		
		String s = JOptionPane.showInputDialog("give me the input");
		JOptionPane.showMessageDialog(null, "You input is " + s);
	}

}
