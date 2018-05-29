package org.ip.sesion07;
import java.util.Scanner;
public class ComprobarPalindromo3 {
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
			StringBuffer c=new StringBuffer("");
			c = c.append(s);
			StringBuffer revertida = c.reverse();
			String comp = revertida.substring(0);
			if(s.equals(comp)){
				return true;
			}else
				return false;
			
	}

}
