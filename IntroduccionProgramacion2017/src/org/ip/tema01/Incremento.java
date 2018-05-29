package org.ip.tema01;

public class Incremento {

	public static void incremento(int n) {
		n++;
		System.out.println("n dentro del metodo es " + n);
	}
	
	public static void main(String[] args) {
		int x = 1;
		System.out.println("Antes de la llamada al metodo, x es " + x);
		incremento(x);
		System.out.println("Despues de la llamada al metodo, x es " + x);
	}
}
