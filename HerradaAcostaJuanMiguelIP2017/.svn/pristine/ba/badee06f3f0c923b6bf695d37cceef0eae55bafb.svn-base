package org.ip.sesion04;

import java.util.Scanner;

public class InvertirEntero {
	public static void mostrarInverso(int valor){
	int resto,valorInvertido = 0;
		while(valor != 0){
			resto = valor % 10;
			valor = valor / 10;
			valorInvertido = valorInvertido*10 + resto;
		}
		System.out.print(valorInvertido);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  entrada=new Scanner(System.in);
		int valor = 0;
		do{
			System.out.println("Introduzca un valor entero");
			valor = entrada.nextInt();
		}while(valor <= 0);
		System.out.print("El número " + valor + " invetido es ");mostrarInverso(valor);
		entrada.close();
	}

}
