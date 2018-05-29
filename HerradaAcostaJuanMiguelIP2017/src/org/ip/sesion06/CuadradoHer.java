package org.ip.sesion06;

public class CuadradoHer extends RectanguloHer{
	public CuadradoHer(){
		setAlto(0);
		setAncho(0);
	}
	public CuadradoHer(double longuitudLado){
		super();
		this.setAlto(longuitudLado);
		this.setAncho(longuitudLado);
	}
	public CuadradoHer(double longuitudLado,String color,boolean relleno){
		super(0,0,"blanco",false);
		this.setAlto(longuitudLado);
		this.setAncho(longuitudLado);
	}
	public double getAncho(){
		return super.getAncho();
	}
	public void setAncho(double ancho){
		super.setAncho(ancho);
	}
	public double getAlto(){
		return super.getAncho();
	}
	public void setAlto(double ancho){
		super.setAlto(ancho);
	}
	@Override
	public String toString() {
		return "CuadradoHer " + super.toString();
	}
	public void mostrarRectangulo(){
		System.out.println("El Cuadrado ha sido creado" + super.getFechaCreacion());
		if (super.isRelleno() == false){
			System.out.println("Es de color " + super.getColor() + ", sin relleno");
		}else
			System.out.println("Es de color " + super.getColor() + ", con relleno");

		System.out.println("Ubicado en (" + super.getX() + ", " + super.getY() + ") y la longitud del lado es " + super.getAncho());
	}
}
