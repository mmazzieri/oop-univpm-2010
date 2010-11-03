package it.univpm.progogg.concurrency;

import java.math.BigInteger;

import javax.swing.JOptionPane;

public class ResponsiveUI extends Thread {
	
	public ResponsiveUI() {
		setDaemon(true);
		start();
	}
	
	@Override
	public void run() {
		BigInteger n1 = BigInteger.ONE;
		BigInteger n2 = BigInteger.ONE;
		BigInteger n3;
		for (int i = 0; i < 10000; i++) {
			n3 = n1.add(n2);
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		ResponsiveUI r = new ResponsiveUI();
		String s = JOptionPane.showInputDialog("give me the input");
		JOptionPane.showMessageDialog(null, "You input is " + s);
	}

}
