package org.ip.sesion07;
import java.util.Scanner;
public class ComprobarPalindromo2 {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce una cadena: ");
		String cadena =entrada.nextLine();
		if (esPalindromo(cadena) == true){
			System.out.println(cadena + " es un palindromo");
		}else{
			System.out.println(cadena + " no es un palindromo");
		}
	}
	public static boolean esPalindromo(String s){
		String nuevo=s.replace(" ", "");
		int inicio = 0;
		int fin = nuevo.length()-1;
		while(inicio < fin){
			if (nuevo.charAt(inicio) != nuevo.charAt(fin)){
				return false;
			}
			++inicio;
		    --fin;
	        }
	    return true;
	    }
}
