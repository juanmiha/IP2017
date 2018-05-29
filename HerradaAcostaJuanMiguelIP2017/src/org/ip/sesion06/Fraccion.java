package org.ip.sesion06;
public class Fraccion implements Comparable<Object>{
	private int numerador;
	private int denominador;
	private static int numFracciones = 0;

	public Fraccion(int numerador,int denominador){
		super();
		this.numerador= numerador;
		this.denominador= denominador;
		numFracciones++;
	}
	public Fraccion(){
		this(0,1);
	}
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraccion otro = (Fraccion) obj;
		return numerador == otro.getNumerador() && denominador == otro.getDenominador();
	}
	public  int getNumerador(){
		return numerador;
	}
	public  int getDenominador(){
		return denominador;
	}
	public static  int getNumFracciones(){
		return numFracciones;
	}
	public String toString(){
		return numerador + "/" + denominador;
	}
	public Fraccion sumar(Fraccion b){
		int num = numerador * b.getDenominador() + b.getNumerador() * denominador;
		int den = denominador * b.getDenominador();
		return new Fraccion(num,den);
	}
	public static Fraccion sumar(Fraccion a, Fraccion b){
		int num = a.getNumerador() * b.getDenominador() + b.getNumerador() * a.getDenominador();
		int den = a.getDenominador() * b.getDenominador();
		return new Fraccion(num,den);
	}
	public Fraccion resta(Fraccion b){
		int num = numerador * b.getDenominador() - b.getNumerador() * denominador;
		int den = denominador * b.getDenominador();
		return new Fraccion(num,den);
	}
	public Fraccion multiplicar(Fraccion b){
		int num = numerador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num,den);
	}
	public Fraccion dividir(Fraccion b){
		int num = numerador * b.getDenominador();
		int den = denominador * b.getNumerador();
		return  new Fraccion(num,den);
	}
	public Fraccion inversa(){
		return new Fraccion(denominador,numerador);
	}
	private static int mcd(int u, int v){
		return (u % v == 0) ? v:mcd(v,u % v);
	}
	public Fraccion simplificar(){
		if (numerador/denominador == 1)
			return new Fraccion(numerador,denominador);
		else
			return new Fraccion(numerador/mcd(denominador,numerador),denominador/mcd(denominador,numerador));
	}
	public int compareTo(Object obj){
		Fraccion otro = (Fraccion) obj;
		double v = (double)this.numerador/(double)this.denominador;
		double u = (double)otro.numerador/(double)otro.denominador;
		if (v>u)
			return 1;
		else if (v<u)
			return -1;
		else
			return 0;
	}
}
