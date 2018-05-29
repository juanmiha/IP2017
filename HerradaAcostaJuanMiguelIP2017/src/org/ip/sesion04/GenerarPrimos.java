package org.ip.sesion04;

public class GenerarPrimos {
	
	public static boolean esPrimo(int n){
		int divisor = 2;
		boolean primo = true;
		while (primo && divisor < n){
		if (n % divisor == 0)
		primo = false;
		divisor++;
		}
		return primo;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadorPrimo = 0;
		int i = 2;
		System.out.println("Los primeros 50 números primos son:");
		while (contadorPrimo < 50){
			if (esPrimo(i)){
				contadorPrimo ++;
				//print
				if (contadorPrimo % 10 ==0)
					System.out.printf(i + "\n");
				else
					System.out.printf(i + "\t");
			}
			i ++;
		}
	}
}
