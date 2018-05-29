package org.ip.sesion07;

import org.ip.sesion05.Circulo;

public class CirculoConExcepcion{
	private double xCentro;
	private double yCentro;
	private double radio;
	private static int numCirculos = 0;
	
	public CirculoConExcepcion() throws Exception{
		this(0.0,0.0,0.0);
		numCirculos ++;
	}
	
	public CirculoConExcepcion(double xCentro, double yCentro, double radio) throws Exception{
		super();
		this.xCentro = xCentro;
		this.yCentro = yCentro;
		setRadio(radio);
		numCirculos ++;
	}
	public CirculoConExcepcion(double radio){
		super();
		this.radio = radio;
		numCirculos ++;
	}
	public CirculoConExcepcion(double xCentro , double yCentro){
		super();
		this.xCentro = xCentro;
		this.yCentro = yCentro;
		numCirculos ++;
	}
	public CirculoConExcepcion(Object obj){
		CirculoConExcepcion otro = (CirculoConExcepcion)obj;
		this.xCentro = otro.getxCentro();
		this.yCentro = otro.getyCentro();
		this.radio = otro.getRadio();
		numCirculos ++;
	}

	public double getxCentro() {
		return xCentro;
	}

	public void setxCentro(double xCentro) {
		this.xCentro = xCentro;
	}

	public double getyCentro() {
		return yCentro;
	}

	public void setyCentro(double yCentro) {
		this.yCentro = yCentro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) throws Exception{
		if (radio >= 0.0)
			this.radio = radio;
		else
			throw new IllegalArgumentException ("El radio no puede ser negativo");
	}

	public static int getNumCirculos() {
		return numCirculos;
	}

	@Override
	public String toString() {
		return "Circulo = {(xCentro=" + xCentro + ", yCentro=" + yCentro + "), radio=" + radio + "}";
	}
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo otro = (Circulo) obj;
		return xCentro == otro.getxCentro() && yCentro == otro.getyCentro() && radio == otro.getRadio();
	}
	
	public double calcularArea(double radio){
		return Math.PI * radio * radio;
	}
	public double calcularLongitud(double radio){
		return 2*Math.PI * radio;
	}
	public double calcularDiametro(double radio){
		return 2*radio;
	}
	public void desplazar(double dx, double dy){
		this.xCentro += dx;
		this.yCentro += dy;
		numCirculos ++;
	}
	public void cambiarTamaño(double factor) throws Exception{
		if (factor >= 0.0)
			this.radio *= factor;
		else
			throw new IllegalArgumentException ("El Factor no puede ser negativo");
	}
}
