package org.ip.sesion02;

import java.util.Scanner;

public class OperacionAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca valores para x e y");
		double x = entrada.nextDouble();
		double y = entrada.nextDouble();
		System.out.println("Los datos son:");
		System.out.println("x = " + x + ", y = " + y);
		String operador = "*";
		System.out.println("Seleccionamos un operador: *, /, +, -.");
		System.out.println("La operación elegida es: " + operador);
		double resultado;
		switch (operador) {
			case "*":
				resultado = x*y;
				System.out.println("El resutlado de la operación es: " + x + operador + y + " = " + resultado );
				break;
			case "/":
				resultado = x/y;
				System.out.println("El resutlado de la operación es: " + x + operador + y + " = " + resultado );
				break;
			case "+":
				resultado = x+y;
				System.out.println("El resutlado de la operación es: " + x + operador + y + " = " + resultado );
				break;
			case "-":
				resultado = x-y;
				System.out.println("El resutlado de la operación es: " + x + operador + y + " = " + resultado );
				break;
		}
		entrada.close();
	}
	

}
