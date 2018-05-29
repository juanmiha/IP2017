package org.ip.sesion02;

public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Muestra por pantalla las raíces de una ecuación de 2º grado dados los valores de a, b y c. 
		//ab^2+ bx + c = 0.
		int a = 1;
		int b = -3;
		int c = 2;
		double raiz = (int) Math.sqrt((Math.pow(b,2)) - (4 * a * c));
		double valor1= (-b + raiz) / (2 * a);
		double valor2= (-b - raiz) / (2 * a);
		if (a == 0){
			System.out.println("Solución de una ecuación de 2º grado con los siguiente valores:");
			System.out.println("a = " + a + ", b = " + b + ", c = " + c);
			System.out.println("No es una ecuación de 2º grado");
		}else if (raiz <= 0){
				System.out.println("Solución de una ecuación de 2º grado con los siguiente valores:");
				System.out.println("a = " + a + ", b = " + b + ", c = " + c);
				System.out.println("No tiene solución real");
		}else{
			System.out.println("Solución de una ecuación de 2º grado con los siguiente valores:");
			System.out.println("a = " + a + ", b = " + b + ", c = " + c);
			System.out.println("Dos Valores posibles:");
			System.out.printf("El primer posible valor es: %4.2f ",valor1);
			System.out.println();
			System.out.printf("El segundo posible valor es: %4.2f ",valor2);
		}
		
	}

}
