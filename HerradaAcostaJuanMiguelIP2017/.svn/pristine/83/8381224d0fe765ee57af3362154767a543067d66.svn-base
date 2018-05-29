package org.ip.sesion03;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int numero;
		do{
			System.out.println("Indica un número (>1) para saber si es un número primo");
			numero = entrada.nextInt();
		}while(numero <= 1);
		int divisor = 2;
		int contador = 1;
		boolean primo = true;
		int parada = (int) Math.ceil(Math.sqrt(numero));
		while (primo && divisor <= parada){
			if(numero % divisor == 0)
				primo = false;
			else{
				divisor = (2*contador)+1;
				contador++;
			}
		}
		if (primo)
			System.out.println("ES PRIMO");
		else
			System.out.println("NO ES PRIMO");
		entrada.close();
	}

}
