package org.ip.sesion01;

public class OperadoresUnarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 8;
		int a, b, c;
		System.out.println("\tantes\tdurante\tdespués");
		i = 8;
		a = i;
		b = i++;
		c = i;
		System.out.println("i++\t" + a + '\t' + b + '\t' + c);
		//Se modifica después de imprimir b ya que el ++ esta detrás de la variable i
		i = 8;
		a = i;
		b = i--;
		c = i;
		System.out.println("i--\t" + a + '\t' + b + '\t' + c);
		//Se modifica después de imprimir b ya que el -- esta detrás de la variable i
		i = 8;
		a = i;
		b = ++i;
		c = i;
		System.out.println("++i\t" + a + '\t' + b + '\t' + c);
		//Se modifica antes de imprimir b ya que el ++ esta delante de la variable i
		i = 8;
		a = i;
		b = --i;
		c = i;
		System.out.println("--i\t" + a + '\t' + b + '\t' + c);
		//Se modifica antes de imprimir b ya que el -- esta delante de la variable i
	}

}
