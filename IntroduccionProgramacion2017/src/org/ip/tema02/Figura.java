package org.ip.tema02;

public abstract class Figura {
	protected double x;
	protected double y;
	
	public Figura(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public abstract double area();
}
