package org.ip.sesion07;
import java.util.Scanner;
public class ComprobarPalindromo1 {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce una cadena: ");
		String cadena = entrada.nextLine();
		if (esPalindromo(cadena) == true){
			System.out.println(cadena + " es un palindromo");
		}else{
			System.out.println(cadena + " no es un palindromo");
		}
	}
	public static boolean esPalindromo(String s){
		int inicio;
		int fin;
		for (inicio=0 , fin=s.length()-1 ; inicio<fin ; inicio++ , fin-- ) {
	            if (s.charAt(inicio) != s.charAt(fin))
	                return false;
	        }
	    return true;
	    }
	
}
