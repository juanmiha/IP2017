package org.ip.tema02;

public class CirculoInt implements FiguraInt {
	private double radio;

	public CirculoInt(double radio) {
		super();
		this.radio = radio;
	}
	@Override
	public double area() {
		return Math.PI * radio * radio;
	}
}
