package org.ip.primerparcial2017;

import java.util.Scanner;

public class FibonacciExamen {

	public static void variacionFibonacci(int numeroTerminos) {
		if (numeroTerminos == 0) {
			System.out.printf("%d", 0);
		}
		else if (numeroTerminos == 1) {
			System.out.printf("%d   %d", 0, 1);
		}
		else if (numeroTerminos == 2) {
			System.out.printf("%d   %d   %d", 0, 1, 2);
		}
		else {
			int fiMenosTres = 0; // f0
			int fiMenosDos = 1;  // f1
			int fiMenosUno = 2;  // f2
			System.out.printf("%d   %d   %d   ", fiMenosTres, fiMenosDos, fiMenosUno);
			int i = 3;
			int fi = fiMenosUno + fiMenosDos - fiMenosTres;
			while (i <= numeroTerminos) {
				System.out.printf("%d   ", fi);
				fiMenosTres = fiMenosDos;
				fiMenosDos = fiMenosUno;
				fiMenosUno = fi;
				fi = fiMenosUno + fiMenosDos - fiMenosTres;
				i++;
			}
		}
	}

	public static void main(String[] args) {
		int numeroTerminos; // nº de términos a mostrar
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("¿Hasta qué término de la serie quieres mostrar?");
			numeroTerminos = entrada.nextInt();
		} while (numeroTerminos < 0);
		variacionFibonacci(numeroTerminos);
		System.out.println();
	}
}
