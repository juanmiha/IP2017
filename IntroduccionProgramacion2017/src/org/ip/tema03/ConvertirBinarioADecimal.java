package org.ip.tema03;

public class ConvertirBinarioADecimal {

	public static void main(String[] args) {
		String strNumeroBinario = "111000";

		// Convierte un n�mero binario a decimal utilizando
		// el m�todo de clase ParseInt de la clase Integer
		// El segundo argumento indica la base

		int numeroDecimal = Integer.parseInt(strNumeroBinario, 2);
		System.out.println("El n�mero binario " + strNumeroBinario
				+ " convertido a n�mero decimal es " + numeroDecimal);
	}
}
