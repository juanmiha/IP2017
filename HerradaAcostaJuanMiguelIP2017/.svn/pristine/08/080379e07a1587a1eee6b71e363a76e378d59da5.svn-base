package org.ip.sesion09;

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
	public static int [][] leerEnteros2D() {
		entrada = new Scanner(System.in);
		System.out.println("Introduce el número de filas");
		int dimension1 = entrada.nextInt();
		System.out.println("Introduce el número de columnas");
		int dimension2 = entrada.nextInt();
		int [][] a = new int [dimension1][dimension2];
		System.out.println("Introduce valores enteros en la matriz ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0;j < a[0].length;j++){
				System.out.print("Introduce valor a[" + i + "," + j +"] => ");
				a[i][j] = entrada.nextInt();
			}
		}
		return a;
	}
	public static int [][] inicializarEnteros2D(){
		entrada = new Scanner(System.in);
		System.out.println("Introduce el número de filas");
		int dimension1 = entrada.nextInt();
		System.out.println("Introduce el número de columnas");
		int dimension2 = entrada.nextInt();
		int [][] a = new int [dimension1][dimension2];
		System.out.println("Introduce valores enteros en la matriz ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0;j < a[0].length;j++){
				int n = 50;
				a[i][j] =(int)(Math.random()*n);
			}
		}
		return a;
	}
	public static void mostrar2D(int[][] a){
		System.out.println("La matriz creada es ");
		for (int fila = 0; fila < a.length; fila++) {
			for (int columna = 0; columna < a[fila].length; columna++) {
				System.out.print(a[fila][columna] + "\t");
			}
			System.out.println();
		}
	}
	public static void mostrar2D(double[][] a){
		System.out.println("La matriz creada es ");
		for (int fila = 0; fila < a.length; fila++) {
			for (int columna = 0; columna < a[fila].length; columna++) {
				System.out.print(a[fila][columna] + "\t");
			}
			System.out.println();
		}
	}

}
