package org.ip.sesion07;

import java.math.BigInteger;
import java.util.Scanner;
public class DivisoresEnterosGrandes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer divisor =>");
		String divisor1 = entrada.nextLine();
		System.out.println("Introduce el segundo divisor =>");
		String divisor2 = entrada.nextLine();
		BigInteger enteroGrande =new BigInteger("9223372036854775807");
		System.out.println("Los 5 primeros n�meros mayores "+ enteroGrande +" divisibles por " + divisor1 + " y " + divisor2 + " son:");
		int contador = 0;
		while(contador <= 4){
			if(esDivisible(enteroGrande,divisor1) && esDivisible(enteroGrande,divisor2)){
				System.out.println(enteroGrande.toString());
				enteroGrande =new BigInteger(enteroGrande.add(BigInteger.ONE).toString());
				contador++;
			}else
				enteroGrande =new BigInteger(enteroGrande.add(BigInteger.ONE).toString());
		}
		entrada.close();
	}
	public static boolean esDivisible(BigInteger enteroGrande,String divisor){
		return (enteroGrande.remainder(BigInteger.valueOf(Long.valueOf(divisor))).toString().equals("0")) ? true:false;

	}
}
