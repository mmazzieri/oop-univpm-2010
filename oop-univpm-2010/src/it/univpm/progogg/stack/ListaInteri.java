package it.univpm.progogg.stack;

class Nodo {
	private int dato;
	private Nodo succ;
	public Nodo(int dato, Nodo succ) {
		this.dato = dato;
		this.succ = succ;
	}
	
	public int getDato() {
		return dato;
	}
	
	public Nodo getSuccessivo() {
		return succ;
	}
}

public class ListaInteri {
	Nodo testa;
	
	public boolean isEmpty() {
		return testa == null;
	}
	
	public void insert(int n) {
		Nodo nuovoNodo = new Nodo(n, testa);
		testa = nuovoNodo;
	}
	
	public void stampa() {
		Nodo corrente = testa;
		while (corrente != null) {
			System.out.println(corrente.getDato());
			corrente = corrente.getSuccessivo();
		}
	}
}
