package org.ip.sesion08;

import java.util.Scanner;

public class EntradaSalidaArrays {
	private static Scanner entrada;
	public static double [] leerReales1D() {
		entrada = new Scanner(System.in);
		System.out.println("Introduce el número de componentes del array");
		int dimension = entrada.nextInt();
		double [] a = new double [dimension];
		System.out.println("Introduce valores enteros en el array ");
		for (int i = 0; i < a.length; i++) {
		System.out.print("Introduce valor " + (i + 1) + "=> ");
		a[i] = entrada.nextDouble();
		}
		return a;
	}
	public static int [] leerEnteros1D() {
		entrada = new Scanner(System.in);
		System.out.println("Introduce el número de componentes del array de enteros");
		int dimension = entrada.nextInt();
		int [] a = new int [dimension];
		System.out.println("Introduce valores enteros en el array ");
		for (int i = 0; i < a.length; i++) {
		System.out.print("Introduce valor " + (i + 1) + "=> ");
		a[i] = entrada.nextInt();
		}
		return a;
	}
	public static int [] inicializarEnteros1D(){
		entrada = new Scanner(System.in);
		System.out.println("Introduce el número de componentes del array de enteros");
		int dimension = entrada.nextInt();
		int [] a = new int [dimension];
		System.out.println("Introduce valores enteros en el array ");
		for (int i = 0; i < a.length; i++) {
			int n = 50;
			a[i] = (int)(Math.random()*n);
		}
		return a;
	}
	public static double [] inicializarReales1D() {
		entrada = new Scanner(System.in);
		System.out.println("Introduce el número de componentes del array");
		int dimension = entrada.nextInt();
		double [] a = new double [dimension];
		System.out.println("Introduce valores enteros en el array ");
		for (int i = 0; i < a.length; i++) {
			int n = 50;
			a[i] = (Math.random()*n);
		}
		return a;
	}
	public static void mostrar1D(double [] a){
		System.out.println("Los componentes del array de reales son:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public static void mostrar1D(int [] a){
		System.out.println("Los componentes del array de enteros son:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
