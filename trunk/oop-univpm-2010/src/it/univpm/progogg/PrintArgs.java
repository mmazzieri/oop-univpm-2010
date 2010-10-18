package it.univpm.progogg;

public class PrintArgs {
	public static void main(String[] args) {
		if (args.length == 0)
			System.out.println("No argument.");
		else
			for (String a : args)
				System.out.println(a);
	}
}
