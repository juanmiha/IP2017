package org.ip.sesion03;

import java.util.Scanner;

public class TrianguloAsteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  entrada=new Scanner(System.in);
		int numero = 1;
		do{
			System.out.println("Introduce el número de lado del triangulo rectangulo:");
			numero = entrada.nextInt();
		}while(numero <= 0);
		System.out.println("Triangulo rectangulo de asteriscos de lado " + numero);
		for(int i = 1;i <= numero; i++){
			for(int j = 1;j <= numero-(i-1); j++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		entrada.close();
	}

}
