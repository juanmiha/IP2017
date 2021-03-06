package org.ip.sesion06;

public class TrianguloHer extends ObjGeometrico{
	private double longitudLado1;
	private double longitudLado2;
	private double longitudLado3;

	public TrianguloHer(){
		longitudLado1 = 1.0;
		longitudLado2 = 1.0;
		longitudLado3 = 1.0;
	}

	public TrianguloHer(double longitudLado1,double longitudLado2,double longitudLado3){
		super();
		this.longitudLado1= longitudLado1;
		this.longitudLado2= longitudLado2;
		this.longitudLado3= longitudLado3;
	}
	public TrianguloHer(double lonitudLado1, double lonitudLado2,double lonitudLado3,String color,boolean relleno){
		super(0,0,color, relleno);
		this.longitudLado1 = lonitudLado1;
		this.longitudLado2 = lonitudLado2;
		this.longitudLado3 = lonitudLado3;
	}

	public double getLongitudLado1() {
		return longitudLado1;
	}

	public void setLongitudLado1(double lonitudLado1) {
		this.longitudLado1 = lonitudLado1;
	}

	public double getLongitudLado2() {
		return longitudLado2;
	}

	public void setLongitudLado2(double lonitudLado2) {
		this.longitudLado2 = lonitudLado2;
	}

	public double getLongitudLado3() {
		return longitudLado3;
	}

	public void setLongitudLado3(double longitudLado3) {
		this.longitudLado3 = longitudLado3;
	}

	@Override
	public String toString() {
		return "Un TrianguloHer = " + super.toString() + "longuitud de lados [" + longitudLado1 + ", " + longitudLado2 + ", " + longitudLado3 + "]";
	}
	public double calcularArea(){
		double S = calcularPerimetro();
		double area = Math.sqrt(S*(S-longitudLado1)*(S-longitudLado2)*(S-longitudLado3));
		return area;
	}
	public double calcularPerimetro(){
		double S = (longitudLado1+longitudLado2+longitudLado3)/2;
		return S;
	}
	public void mostrarTriangulo(){
		System.out.println("El triangulo ha sido creado" + super.getFechaCreacion());
		if (super.isRelleno() == false){
			System.out.println("Es de color " + super.getColor() + ", sin relleno");
		}else
			System.out.println("Es de color " + super.getColor() + ", con relleno");

		System.out.println("Ubicado en (" + super.getX() + ", " + super.getY() + ") y con longitud de lados [" + longitudLado1 + ", "
				+ longitudLado2 + ", " + longitudLado3 + "]");
	}
}
