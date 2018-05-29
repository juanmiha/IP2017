package org.ip.tema02;

public class RectanguloPrincipal {

	public static void main(String[] args) {
		Rectangulo rect1 = new Rectangulo(10, 15, 20, 5);
		Rectangulo rect2 = new Rectangulo(7, 15, 7, 5);
		Rectangulo rect3 = new Rectangulo(10, 15, 20, 20);
		
		int altura = rect1.getAlto();
		if (altura < 10)
			System.out.println("Rect�ngulo 1 peque�o");
		System.out.println("Rect�ngulo 1 " + rect1.toString());
		if (rect1.equals(rect2))
			System.out.println("Mismos rect�ngulos 1 y 2");
		else
			System.out.println("Distintos rect�ngulos 1 y 2");
		if (rect1.equals(rect3))
			System.out.println("Mismos rect�ngulos 1 y 3");
		else
			System.out.println("Distintos rect�ngulos 1 y 3");
		System.out.println("El n�mero de rect�ngulos creados es "
				+ Rectangulo.getNumRectangulos());
		rect1.desplazar(7, 9);
		System.out.println("Rect�ngulo 1 " + rect1.toString());
		if (rect1.compareTo(rect3) == 0)
			System.out.println("Rect�ngulos 1 y 3 con igual �rea");
		else if (rect1.compareTo(rect3) == -1)
			System.out.println("Rect�ngulo 1 tiene menor �rea que 3");
		else
			System.out.println("Rect�ngulo 1 tiene mayor �rea que 3");
		if (rect1.estaDentro(20, 30))
			System.out.println("El punto (20, 30) est� dentro del rect�ngulo 1");
		else
			System.out.println("El punto (20, 30) no est� dentro del rect�ngulo 1");
	}
}
