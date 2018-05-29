package org.ip.sesion03;

import java.util.Scanner;

public class NumeroPerfecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int numero, sumaPerfecto, divisor;
		sumaPerfecto = 0 ;
		divisor = 1;
		do{
			System.out.println("Indica un número entero positivo para saber si es perfecto");
			numero = entrada.nextInt();
		}while(numero <= 0);
		while (divisor < numero){
			 if (numero % divisor == 0){
				 sumaPerfecto = sumaPerfecto + divisor;
			 }
			 divisor += 1;
			}
		if (sumaPerfecto == numero)
			System.out.println("El número es perfecto");
		else
			System.out.println("El número no es perfecto");
		entrada.close();
	}

}
