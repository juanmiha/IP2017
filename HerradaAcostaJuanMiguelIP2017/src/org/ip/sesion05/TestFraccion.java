package org.ip.sesion05;

public class TestFraccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraccion f1 = new Fraccion(1,5);
		Fraccion f2 = new Fraccion(4,5);
		Fraccion f3 = new Fraccion(-11,22);
		
		System.out.println("LAS FRACCIONES CREADAS SON");
		System.out.println("");
		System.out.println("PRIMERA FACCI�N => " + f1.toString());
		System.out.println("PRIMERA FACCI�N => " + f2.toString());
		System.out.println("PRIMERA FACCI�N => " + f3.toString());
		
		System.out.println("El n�mero de fracciones creadas es " + Fraccion.getNumFracciones());
		if(f1.equals(f2) == false)
			System.out.println("la primera fracci�n NO ES IGUAL a la segunda");
		else
			System.out.println("la primera fracci�n ES IGUAL a la segunda");
		
		System.out.println("El denominador de la primera fracci�n es" + f1.getDenominador());
		
		System.out.println("La suma, utilizando el m�todo de clase "+ f1.toString() + " + " + f2.toString()+  " es " + Fraccion.sumar(f1, f2));
		
		Fraccion sum= f1.sumar(f2);
		
		System.out.println("La suma, utilizando el m�todo de objeto "+ f1.toString() + " + " + f2.toString()+  " es " + sum +
		" simplificada " + (sum.getNumerador()==sum.getDenominador()? 1:sum.simplificar()));
		
		System.out.println("La resta de " + f1.toString() + " - " + f2.toString() + " es " + f1.resta(f2) + 
		" simplificada " + f1.resta(f2).simplificar());
		
		System.out.println("El producto " + f1.toString() + " x " + f2.toString() + " es " + f1.multiplicar(f2));
		
		System.out.println("La divisi�n " + f1.toString() + " / " + f3.toString() + " es " + f1.dividir(f3));
		
		System.out.println("La inversa de la primera fracci�n " + f1.toString() + " es " + 
		(f1.getDenominador()/f1.getNumerador() ==  f1.getDenominador()? f1.getDenominador():f1.inversa()));
		
		System.out.println("La fracci�n " + f3.toString() + " simplificada es " + f3.simplificar());
		
		System.out.println("El n�mero de fracciones creadas es " + Fraccion.getNumFracciones());
		
		
	}

}
