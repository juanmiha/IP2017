package org.ip.sesion05;

public class EcuacionCuadratica {
	private double a;
	private double b;
	private double c;
	private static int numEcuacionesCuadraticas = 0;
	
	public EcuacionCuadratica (double a, double b, double c){
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		numEcuacionesCuadraticas++;
	}
	public EcuacionCuadratica (){
		this(0,0,0);
	}
	
	public double getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public static int getNumEcuacionesCuadraticas() {
		return numEcuacionesCuadraticas;
	}
	public String toString(){
		if (a == 0 && (b > 0 || b < 0) && c > 0)
			return  b+"x " + "+ " + c;
		if (a == 0 && (b > 0 || b < 0) && c < 0)
			return  b+"x " + c;
		if (b == 0 && (a > 0 || a < 0) && c > 0)
			return  a + "x*x " + "+ " + c;
		if (b == 0 && (a > 0 || a < 0) && c < 0)
			return  a + "x*x " + c;
		if (c == 0 && (a > 0 || a < 0) && b > 0)
			return  a + "x*x " + "+ " + b + "x";
		if (c == 0 && (a > 0 || a < 0) && b > 0)
			return  a + "x*x " + b + "x";
		if (a == 0 && b == 0  && (c < 0 || c > 0))
			return  ""+c;
		if (a == 0 && c == 0  && (b < 0 || b > 0))
			return  b + "x";
		if (b == 0 && c == 0  && (a < 0 || a > 0))
			return  a + "x*x";
		if ((a < 0 || a > 0) && b < 0 && c < 0)
			return a + "x*x " + b+"x " + c;
		if ((a < 0 || a > 0) && b < 0 && c > 0)
			return a + "x*x " + b+"x " + "+ " + c;
		if ((a < 0 || a > 0) && b > 0 && c < 0)
			return a + "x*x " + "+ " + b+"x " + c;
		
		return a + "x*x " + "+ " + b+"x " + "+ " + c;
	}
	public double getDiscriminante(){
		return (b*b)+(-4*a*c);
    
	}
	public double getRaiz1(){
		double num = -b + Math.sqrt(getDiscriminante());
		return num/(2*a);
	}
	public double getRaiz2(){
		double num = -b - Math.sqrt(getDiscriminante());
		return num/(2*a);
	}
	
}
