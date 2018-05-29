package org.ip.tema02;

public class PasaObjecto {

	public static void printAreas(Circulo1 c, int n) {
		System.out.println("Radio \t\tArea");
		while (n >= 1) {
			System.out.println(c.getRadio() + "\t\t" + c.getArea());
			c.setRadio(c.getRadio() + 1);
			n--;
		}
	}

	public static void main(String[] args) {
		Circulo1 miCirculo = new Circulo1(1);
		int n = 5;
		printAreas(miCirculo, n);
		System.out.println("El radio es " + miCirculo.getRadio());
		System.out.println("n es " + n);
	}
}
