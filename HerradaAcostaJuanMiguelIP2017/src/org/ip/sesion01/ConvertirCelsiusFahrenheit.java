package org.ip.sesion01;

public class ConvertirCelsiusFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//F = 9 C / 5 + 32
		double celsius = 31;
		double fahrenheit = 9 * celsius / 5 + 32;
		System.out.printf("Los grados Fahrenheit correspondientes a %2.2f " ,celsius);
		System.out.printf("grados Celsius son => %2.2f " ,fahrenheit);
	}

}
