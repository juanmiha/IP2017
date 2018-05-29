package org.ip.sesion06;

public class RectanguloHer extends ObjGeometrico {
	private double ancho;
	private double alto;

	public RectanguloHer(){
		ancho = 0.0;
		alto = 0.0;
	}
	public RectanguloHer(double ancho,double alto){
		super();
		this.ancho = ancho;
		this.alto = alto;
	}
	public RectanguloHer(double ancho,double alto,String color,boolean relleno){
		super(0,0,color,relleno);
		this.ancho = ancho;
		this.alto = alto;

	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	@Override
	public String toString() {
		return "RectanguloHer " + super.toString() + "ancho=" + ancho + ", alto=" + alto ;
	}
	public double calcularArea(){
		return ancho*alto;
	}
	public double calcularPerimetro(){
		return 2*ancho + 2*alto;
	}
	public void mostrarRectangulo(){
		System.out.println("El Rectangulo ha sido creado" + super.getFechaCreacion());
		if (super.isRelleno() == false){
			System.out.println("Es de color " + super.getColor() + ", sin relleno");
		}else
			System.out.println("Es de color " + super.getColor() + ", con relleno");

		System.out.println("Ubicado en (" + super.getX() + ", " + super.getY() + "), el ancho es " + ancho + "y el alto es "
				+ alto);
	}
}
