package org.ip.sesion04;

import java.util.Scanner;

public class Sumatoria {
	public static int sumaIterativa(int x){
		if(x == 0) return 1;
		int suma = 0;
		int i = 1;
		while (i <= x){
			suma = suma + i;
			i++;
		}
		return suma;
	}
	
	public static int sumaDirecta(int x){
		if (x == 0) return 1;
		int suma = x*(x+1)/2;
		return suma; 
		
	}
	
	public static int sumaRecursiva(int x){
		if (x == 1) 
			return 1;
		else
			return x + sumaRecursiva(x - 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el número de terminos que desea sumar");
		int x = entrada.nextInt();
		System.out.println("La suma usando el método iterativo de los " + x + " primeros números es: " + sumaIterativa(x));
		System.out.println("La suma usando el método directo de los " + x + " primeros números es: " + sumaDirecta(x));
		System.out.println("La suma usando el método recursivo de los " + x + " primeros números es: " + sumaRecursiva(x));
		
		entrada.close();
	}

}
