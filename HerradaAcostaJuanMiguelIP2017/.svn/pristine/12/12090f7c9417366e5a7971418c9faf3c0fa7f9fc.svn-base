package org.ip.sesion04;

import java.util.Scanner;

public class MaximoComunDivisor {
	
	public static int mcdRecursivo(int m, int n){
		if (m % n == 0)
			return n;
		else
			return mcdRecursivo(n,m%n);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int m,n;
		do{
			System.out.println("Introduce el primer valor");
			m = entrada.nextInt();
		}while(m <= 0);
		do{
			System.out.println("Introduce el segundo valor");
			n = entrada.nextInt();
		}while(n <= 0);

		System.out.println("El máximo común divisor de " + m + " y " + n + " es " + mcdRecursivo(m,n));
		entrada.close();
	
	}

}
