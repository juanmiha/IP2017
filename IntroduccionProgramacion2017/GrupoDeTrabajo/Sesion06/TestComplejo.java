package org.ip.sesion06;
import java.util.Locale;
import java.util.Scanner;
public class TestComplejo {

	private static Scanner entrada;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		entrada.useLocale(Locale.ENGLISH);
		System.out.println("PRIMER COMPLEJO");
		System.out.println("Introduce la parte real");
		double a = entrada.nextDouble();
		System.out.println("Introduce la parte imaginaria");
		double b = entrada.nextDouble();
		Complejo complejo1 = new Complejo(a,b);
		System.out.println("SEGUNDO COMPLEJO");
		System.out.println("Introduce la parte real");
		double c = entrada.nextDouble();
		System.out.println("Introduce la parte imaginaria");
		double d = entrada.nextDouble();
		Complejo complejo2 = new Complejo(c,d);
		System.out.println();
		System.out.println("RESULTADOS DE LAS OPERACIONES");
		System.out.println("("+complejo1 + ") + (" +complejo2 + ") = " +complejo1.sumar(complejo2));
		System.out.println("("+complejo1 + ") - (" +complejo2 + ") = " +complejo1.restar(complejo2));
		System.out.println("("+complejo1 + ") * (" +complejo2 + ") = " +complejo1.multiplicar(complejo2));
		System.out.println("("+complejo1 + ") / (" +complejo2 + ") = " +complejo1.dividir(complejo2));
		System.out.println("|" + complejo1.toString() + "|"+ " = " +complejo1.abs());
		System.out.println("La fase del primer complejo es "+complejo1.fase()+ " radianes");
		

	}

}
