package org.ip.tema02;

public class RectanguloPrincipal {

	public static void main(String[] args) {
		Rectangulo rect1 = new Rectangulo(10, 15, 20, 5);
		Rectangulo rect2 = new Rectangulo(7, 15, 7, 5);
		Rectangulo rect3 = new Rectangulo(10, 15, 20, 20);
		
		int altura = rect1.getAlto();
		if (altura < 10)
			System.out.println("Rectángulo 1 pequeño");
		System.out.println("Rectángulo 1 " + rect1.toString());
		if (rect1.equals(rect2))
			System.out.println("Mismos rectángulos 1 y 2");
		else
			System.out.println("Distintos rectángulos 1 y 2");
		if (rect1.equals(rect3))
			System.out.println("Mismos rectángulos 1 y 3");
		else
			System.out.println("Distintos rectángulos 1 y 3");
		System.out.println("El número de rectángulos creados es "
				+ Rectangulo.getNumRectangulos());
		rect1.desplazar(7, 9);
		System.out.println("Rectángulo 1 " + rect1.toString());
		if (rect1.compareTo(rect3) == 0)
			System.out.println("Rectángulos 1 y 3 con igual área");
		else if (rect1.compareTo(rect3) == -1)
			System.out.println("Rectángulo 1 tiene menor área que 3");
		else
			System.out.println("Rectángulo 1 tiene mayor área que 3");
		if (rect1.estaDentro(20, 30))
			System.out.println("El punto (20, 30) está dentro del rectángulo 1");
		else
			System.out.println("El punto (20, 30) no está dentro del rectángulo 1");
	}
}
