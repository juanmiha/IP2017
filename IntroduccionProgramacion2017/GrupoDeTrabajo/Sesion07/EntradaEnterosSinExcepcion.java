package org.ip.sesion07;

import java.util.Scanner;

public class EntradaEnterosSinExcepcion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Introducir dos enteros
		System.out.print("Introduzca dos valores enteros: ");
		int number1 = entrada.nextInt();
		int number2 = entrada.nextInt();

		System.out.println("La suma es  " + (number1 + number2));
	}
}
