package org.ip.sesion05;

public class Circulo {
	private double xCentro;
	private double yCentro;
	private double radio;
	private static int numCirculos = 0;
	
	public Circulo(){
		this(0.0,0.0,0.0);
	}
	
	public Circulo(double xCentro, double yCentro, double radio){
		super();
		this.xCentro = xCentro;
		this.yCentro = yCentro;
		this.radio = radio;
		numCirculos ++;
	}
	public Circulo(double radio){
		this(0.0,0.0,radio);

	}
	public Circulo (double xCentro , double yCentro){
		this(xCentro,yCentro,0.0);
	}
	public Circulo(Object obj){
		Circulo otro = (Circulo)obj;
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

	public void setRadio(double radio) {
		this.radio = radio;
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
	
	public double calcularArea(){
		return Math.PI * radio * radio;
	}
	public double calcularLongitud(){
		return 2*Math.PI * radio;
	}
	public double calcularDiametro(){
		return 2*radio;
	}
	public int compareTo(Object obj){
		Circulo otro = (Circulo) obj;
		if (calcularArea() == otro.calcularArea())
			return 0;
		else if (calcularArea() < otro.calcularArea())
			return -1;
		else
			return 1;
	}
	
	public void desplazar(double dx, double dy){
		this.xCentro += dx;
		this.yCentro += dy;
		numCirculos ++;
	}
	public void cambiarTamaño(double factor){
			this.radio *= factor;
			numCirculos ++;
	}
	public boolean estaDentro(double xCentro1,double yCentro1){
		double calculo = Math.pow((xCentro - xCentro1),2) + Math.pow((yCentro - yCentro1),2);
		if ( calculo <= (radio*radio))
			return true;
		else
			return false;
	}
}
