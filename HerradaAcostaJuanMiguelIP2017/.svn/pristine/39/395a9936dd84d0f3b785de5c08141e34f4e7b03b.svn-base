package org.ip.sesion03;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int numero;
		int f0 = 0;
		int f1 = 1;
		int f2 = f0 + f1;
		do{
			System.out.println("Indica cuántos términos quieres mostrar de la serie de Fibonacci");
			numero = entrada.nextInt();
		}while(numero <= 0);
		for(int i = 0;i < numero;i++ ){
		System.out.print(f0);
		System.out.print("\t");
		f0 = f1;
		f1 = f2;
		f2 = f1 + f0;
		}
		entrada.close();
	}

}
