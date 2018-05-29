package org.ip.sesion03;
import java.util.Scanner;
public class BucleCentinela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, contadorPositivos, contadorNegativos, contadorLeidos, sumaPositivos, sumaNegativos;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese valores enteros, el programa terminara si la entrada es 0");
		contadorPositivos = contadorNegativos = contadorLeidos = sumaPositivos = sumaNegativos = 0;
		numero = entrada.nextInt();
		while (numero != 0){
			if (numero > 0){
				contadorPositivos += 1;
				contadorLeidos += 1;
				sumaPositivos = sumaPositivos + numero;
			}else{
				contadorNegativos += 1;
				contadorLeidos += 1;
				sumaNegativos = sumaNegativos + numero;
			}
			numero = entrada.nextInt();
		}	
		double media =(double)(sumaPositivos + sumaNegativos)/(double)(contadorLeidos);
		System.out.println("El número de positivos es: " + contadorPositivos);
		System.out.println("El número de negativos es: " + contadorNegativos);
		System.out.println("El número total de valores leidos es: " + contadorLeidos);
		System.out.println("La suma de positivos es: " + sumaPositivos);
		System.out.println("La suma de negativos es: " + sumaNegativos);
		System.out.println("La media de los valores es: " + media);
		
		entrada.close();
	}

}
