package org.ip.sesion05;
import java.util.Scanner;
public class TestEcuacionCuadratica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada =new Scanner(System.in);
		System.out.println("Introduce los valores de los coeficientes de la");
		System.out.println("ecuación cuadrática: ax*x + bx + c = 0");
		System.out.print("a ="); double a =entrada.nextDouble();
		System.out.print("b ="); double b =entrada.nextDouble();
		System.out.print("c ="); double c =entrada.nextDouble();
		EcuacionCuadratica c1 = new EcuacionCuadratica(a, b, c);
		System.out.println("EcuacionCuadratica: "+ c1.toString());
		if (c1.getA() == 0 || c1.getB() == 0 || c1.getC() == 0 ){
			System.out.println("No es una ecuacion cuadratica");
		}
		if (c1.getDiscriminante() > 0){
			System.out.println("Ecuación cuadrática con dos raices de valores");
			System.out.println("x1 = " + c1.getRaiz1());
			System.out.println("x2 = " + c1.getRaiz2());
		}else
			System.out.println("Ecuación cuadrática sin raices reales");
		
		entrada.close();
	}

}
