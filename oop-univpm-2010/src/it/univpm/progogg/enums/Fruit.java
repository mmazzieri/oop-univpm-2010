package it.univpm.progogg.enums;

public enum Fruit {
	MELA("Frutto tondo e dolce"),
	PERA("Frutto allungato e dolce"),
	NOCE("Frutto secco in guscio"),
	FRAGOLA("Frutto di bosco");
	
	private String description;
	
	private Fruit(String description) {
		this.description = description;
	}
	
	@Override public String toString() {
		return name().charAt(0) + name().substring(1).toLowerCase();
	};
	
	public String getDescription() {
		return description;
	}
	
	public static void main(String[] args) {
		for(Fruit f : Fruit.values())
			System.out.println(f + ": " + f.getDescription());
	}
	
}
