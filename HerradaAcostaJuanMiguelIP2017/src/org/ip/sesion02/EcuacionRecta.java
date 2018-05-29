package org.ip.sesion02;

public class EcuacionRecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 1;
		int y1 = 1;
		int x2 = 2;
		int y2 = 4;
		double pendiente = (y2 - y1)/(x2 - x1);
		double intersecion = y2 - (pendiente * x2);
		if (y2 == y1 || x2 == x1){
			System.out.println("Cálculo de la ecuación de la recta que pasa por dos puntos");
			System.out.println("Ecuación de la recta que pasa por: (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ")");
			System.out.println("Los dos puntos (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ") coinciden, no se puede obtener la ecuacion  de la recta" );
		}else if (x2 - x1 == 0){
			System.out.println("Cálculo de la ecuación de la recta que pasa por dos puntos");
			System.out.println("Ecuación de la recta que pasa por: (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ")");
			System.out.println("x = " + x1 );
		}else if (y2 - y1 == 0){
			System.out.println("Cálculo de la ecuación de la recta que pasa por dos puntos");
			System.out.println("Ecuación de la recta que pasa por: (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ")");
			System.out.println("y = " + y1 );
		}else if (intersecion == 0){
			System.out.println("Cálculo de la ecuación de la recta que pasa por dos puntos");
			System.out.println("Ecuación de la recta que pasa por: (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ")");
			System.out.println("y = " + pendiente + "x" );
		}else if (intersecion < 0){
			System.out.println("Cálculo de la ecuación de la recta que pasa por dos puntos");
			System.out.println("Ecuación de la recta que pasa por: (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ")");
			System.out.println("y = " + pendiente + "x " + intersecion);
		}else{
			System.out.println("Cálculo de la ecuación de la recta que pasa por dos puntos");
			System.out.println("Ecuación de la recta que pasa por: (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ")");
			System.out.println("y = " + pendiente + "x" + " + " + intersecion);
		}
	}

}
