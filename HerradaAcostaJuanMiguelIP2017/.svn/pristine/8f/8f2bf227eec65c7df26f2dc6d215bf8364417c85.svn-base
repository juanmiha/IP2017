package org.ip.sesion03;
import java.util.Scanner;
public class Euclides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividendo, divisor, resto, cociente;
		Scanner entrada=new Scanner(System.in);
		do{
			System.out.println("Introduce el primer valor entero positivo:");
			dividendo = entrada.nextInt();
		}while(dividendo <= 0);
		do{
			System.out.println("Introduce el segundo valor entero positivo:");
			divisor = entrada.nextInt();
		}while(divisor <= 0);
		cociente = 0;
		resto = dividendo;
		while(resto >= divisor){
			resto = resto - divisor;
			cociente += 1;
		}
		System.out.println("EL MCD de " + dividendo + " y " + divisor + " es " + cociente);
		
		
		entrada.close();
	}

}
