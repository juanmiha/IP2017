package org.ip.sesion06;

public class CirculoHer extends ObjGeometrico {
	private double radio;

	public CirculoHer(){
		radio = 0;
	}
	public CirculoHer(double radio){
		super();
		this.radio = radio;
	}
	public CirculoHer(double radio,String color,boolean relleno){
		super(0,0,color,relleno);
		this.radio = radio;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public String toString() {
		return "CirculoHer = " + super.toString()+ ", radio=" + radio;
	}
	public double calcularArea(){
		return Math.PI*radio*radio;
	}
	public double calcularDiametro(){
		return 2*Math.PI;
	}
	public double calcularPerimetro(){
		return 2*Math.PI*radio;
	}
	public void mostrarCirculo(){
		System.out.println("El Circulo ha sido creado" + super.getFechaCreacion());
		if (super.isRelleno() == false){
			System.out.println("Es de color " + super.getColor() + ", sin relleno");
		}else
			System.out.println("Es de color " + super.getColor() + ", con relleno");

		System.out.println("Ubicado en (" + super.getX() + ", " + super.getY() + "), el radio es " + radio);
	}
}
