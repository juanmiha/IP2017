package org.ip.tema03;

public class ConvertirBinarioADecimal {

	public static void main(String[] args) {
		String strNumeroBinario = "111000";

		// Convierte un número binario a decimal utilizando
		// el método de clase ParseInt de la clase Integer
		// El segundo argumento indica la base

		int numeroDecimal = Integer.parseInt(strNumeroBinario, 2);
		System.out.println("El número binario " + strNumeroBinario
				+ " convertido a número decimal es " + numeroDecimal);
	}
}
