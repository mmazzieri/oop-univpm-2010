package it.univpm.progogg;

public class Doll {
	private String name = "";

	public Doll() {
		System.out.println("Doll constructor");
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		new MatrioskaDoll(new Doll[] { new ActionFigure(), new BarbieDoll() });
	}
}

class ActionFigure extends Doll {
	public ActionFigure() {
		System.out.println("ActionFigure constructor");
	}
}

class BarbieDoll extends Doll {
	public BarbieDoll() {
		System.out.println("BarbieDoll constructor");
	}
}

class MatrioskaDoll extends Doll {
	private Doll[] internalDolls;

	public MatrioskaDoll(Doll[] dolls) {
		internalDolls = dolls;
		System.out.print("MatrioskaDoll constructor");
		for (Doll d : dolls)
			System.out.print(d.getName());
		System.out.println();
	}
}
