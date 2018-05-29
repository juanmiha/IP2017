package org.ip.sesion06;

public class Complejo {
	private double real;
	private double imaginaria;

	public Complejo (double real,double imaginaria){
		super();
		this.real = real;
		this.imaginaria = imaginaria;
	}
	public Complejo (double real){
		this.real = real;
	}
	public  double getReal(){
		return real;
	}
	public  double getImaginaria(){
		return imaginaria;
	}
	public String toString(){
		if (imaginaria == 0){
			return real + " ";
		}
		if (real == 0){
			return this.imaginaria + "i";
		}
		if (imaginaria < 0){
			return real + " - " + imaginaria + "i";
		}
		return real + " + " + imaginaria + "i";
	}
	public Complejo sumar(Complejo b){
		//a + bi + c + di = (a + c) + (b + d)i
		double r = this.real + b.getReal();
		double i = this.imaginaria + b.getImaginaria();
		return new Complejo(r,i);
	}
	public Complejo restar(Complejo b){
		//a + bi – (c + di) = (a – c) + (b – d)i
		double r = this.real - b.getReal();
		double i = this.imaginaria - b.getImaginaria();
		return new Complejo(r,i);
	}
	public Complejo multiplicar(Complejo b){
		//(a + bi) * (c + di) = (ac – bd) + (bc + ad)i
		double r = (this.real * b.getReal()) - (this.imaginaria * b.getImaginaria());
		double i = (this.imaginaria * b.getReal()) + (this.real * b.getImaginaria());
		return new Complejo(r,i);
	}
	public Complejo dividir(Complejo b){
		//(a + bi) / (c + di) = (ac + bd) / (c2 + d2) + (bc – ad)i / (c2 + d2)
		double r = (this.real * b.getReal()) + (this.imaginaria * b.getImaginaria())/ (Math.pow(b.getReal(), 2)+ Math.pow(b.getImaginaria(),2));
		double i = (this.imaginaria * b.getReal()) - (this.real * b.getImaginaria())/(Math.pow(b.getReal(), 2)+ Math.pow(b.getImaginaria(),2));
		return new Complejo(r,i);
	}
	public Complejo abs(){
		double r = Math.sqrt(real*real + imaginaria*imaginaria);
		return new Complejo(r);
	}
	public double fase(){
		return  Math.atan2(imaginaria, real);
	}
}
