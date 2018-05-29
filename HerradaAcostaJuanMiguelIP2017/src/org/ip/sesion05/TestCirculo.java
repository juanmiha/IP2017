package org.ip.sesion05;
import java.util.Scanner;
public class TestCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		Circulo circ1 = new Circulo(1.0, 1.0, 1.0);
		Circulo circ2 = new Circulo();
		Circulo circ3 = new Circulo(0.0, 0.0);
		Circulo circ4 = new Circulo(circ3);
		System.out.println("Circulo 1 " + circ1.toString());
		System.out.println("Circulo 2 " + circ2.toString());
		System.out.println("Circulo 3 " + circ3.toString());
		System.out.println("Circulo 4 " + circ4.toString());
		if	(circ1.equals(circ2) == true)
			System.out.println("El circulo 1 y 2 son iguales");
		else
			System.out.println("El circulo 1 y 2 son distintos");
		System.out.println("El número de circulos creados es " + Circulo.getNumCirculos());
		if	(circ1.equals(circ4) == true)
			System.out.println("El circulo 1 y 4 son iguales");
		else
			System.out.println("El circulo 1 y 4 son distintos");
		if (circ1.compareTo(circ2) == 0)
			System.out.println("El circulo 1 y el circulo 2 son iguales en area");
		else if (circ1.compareTo(circ2) < 0)
			System.out.println("El circulo 1 es más pequeño que el circilo 2 en area");
		else
			System.out.println("El circulo 1 es más grande que el circilo 2 en area");
		circ1.setRadio(2.5);
		System.out.println("Circulo 1 => " + circ1.calcularArea() + ", " + circ1.calcularDiametro() + ", " + circ1.calcularLongitud());
		double cor1 = 1.0;
		double cor2 = 2.0;
		if(circ1.estaDentro(cor1,cor2) == true)
			System.out.println("El punto (" + cor1 + ", " + cor2 + ") esta dentro del circulo 1 " + circ1.toString() );
		else
			System.out.println("El punto (" + cor1 + ", " + cor2 + ") no esta dentro del circulo 1 " + circ1.toString() );
		System.out.println("Indica las cordenadas  del punto P (x, y) centro de un nuevo circulo");
		double xCentro = entrada.nextDouble();
		double yCentro = entrada.nextDouble();
		System.out.println("Introduce el valor del radio del nuevo circulo");
		double radio =  entrada.nextDouble();
		Circulo circ5 =new Circulo(xCentro,yCentro,radio);
		System.out.println("Circulo 5 " + circ5.toString());
		System.out.println("Circulo 15 => " + circ5.calcularArea() + ", " + circ5.calcularDiametro() + ", " + circ5.calcularLongitud());
		System.out.println("El número de circulos creados es " + Circulo.getNumCirculos());
		Circulo circ6 =new Circulo(2.0,2.0,5.0);
		Circulo circ7 =new Circulo(3.0,3.0,1.0);
		System.out.println("Circulo 6 " + circ6.toString());
		System.out.println("Circulo 7 " + circ7.toString());
		System.out.println("El número de circulos creados es " + Circulo.getNumCirculos());
		entrada.close();
	}

}
