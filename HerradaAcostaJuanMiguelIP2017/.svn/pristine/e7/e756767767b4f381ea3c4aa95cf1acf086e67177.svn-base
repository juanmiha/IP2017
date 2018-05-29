package org.ip.sesion06;
import java.util.Scanner;
public class TestFraccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada =new Scanner(System.in);
		int numerador1 = 0;
		int denominador1 = 0;
		int denominador2 = 0;
		int numerador2 = 0;
		System.out.println("¿Cuántas comparaciones de fracciones deseas hacer?");
		int repeticion = entrada.nextInt();
		for (int i = 0;i < repeticion;i++ ){
			System.out.println("Introduce un numerador y un denominador de la primera fracción");
			numerador1=entrada.nextInt();
			denominador1=entrada.nextInt();
			System.out.println("Introduce un numerador y un denominador de la segunda fracción");
			numerador2 =entrada.nextInt();
			denominador2 =entrada.nextInt();
			Fraccion f1 =new Fraccion(numerador1,denominador1);
			Fraccion f2 =new Fraccion(numerador2,denominador2);
			if(f1.compareTo(f2) == 0){
				System.out.println(f1.toString() + " es igual que " + f2.toString());
			}else if(f1.compareTo(f2) < 0){
				System.out.println(f1.toString() + " es menor que " + f2.toString());
			}else{
				System.out.println(f1.toString() + " es mayor que " + f2.toString());
			}
			
		}
		entrada.close();
	}
}
