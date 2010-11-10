package it.univpm.progogg.gui.mvc;

import java.util.Observable;

public class RightTriangle extends Observable {
	private float base;
	private float height;
	
	public RightTriangle(float base, float height) {
		this.base = base;
		this.height = height;
	}
	
	public float base() {
		return base;
	}

	public float hypothenuse() {
		return (float) Math.sqrt(base * base + height * height);
	}
	
	public float height() {
		return height;
	}
	
	public void setBase(float b) {
		base = b;
		setChanged();
		notifyObservers();
	}
	
	public void setHeight(float h) {
		height = h;
		setChanged();
		notifyObservers();
	}
}
