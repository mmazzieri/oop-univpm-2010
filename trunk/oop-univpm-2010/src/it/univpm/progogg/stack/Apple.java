package it.univpm.progogg.stack;

class Apple {
	String provenance;

	public Apple(String provenance) {
		this.provenance = provenance;
	}

	@Override
	public String toString() {
		return "Apple from " + provenance;
	}
}