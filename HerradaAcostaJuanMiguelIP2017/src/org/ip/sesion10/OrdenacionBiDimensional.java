package org.ip.sesion10;

public class OrdenacionBiDimensional {
	public static String muestraMatriz(int[][] matriz) {
		String s = "Matriz:\n";
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[0].length; j++){
				s += matriz[i][j];
				if(j < matriz[0].length - 1){
					s += "\t";
				}
			}
			if(i < matriz.length - 1){
				s += "\n";
			}

		}
		return s;
	}

	public static int[] transformarMatrizEnArray(int[][] matriz) {
		int[] x = new int[matriz.length * matriz[0].length];
		int k = 0;
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[0].length; j++){
				x[k++] = matriz[i][j];
			}
		}
		return x;
	}

	public static String muestraArray(int[] array) {
		String s = "Array: [";
		for(int i = 0; i < array.length; i++){
			s += array[i];
			if(i < array.length - 1){
				s += "\t";
			} else {
				s += "]";
			}
		}
		return s;
	}

	public static void insercion(int[] array) {
		Ordenacion.insercion(array);

	}

	public static int[][] transformarArrayOrdenadoEnMatrizFilas(int[][] matriz,int[] array) {
		int[][] x = new int[matriz.length][matriz[0].length];
		int k = 0;
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[0].length; j++){
				x[i][j] = array[k++];
			}
		}
		return x;
	}

	public static int[][] transformarArrayOrdenadoEnMatrizColumnas(int[][] matriz, int[] array) {
		int[][] x = new int[matriz[0].length][matriz.length];
		int k = 0;

		for(int j = 0; j < matriz.length; j++){
			if(j==4){
				System.out.println();
			}
			for(int i = 0; i < matriz[0].length; i++){
				x[i][j] = array[k++];
		    }
		}
		return x;
	}

	public static int[][] matrizOrdenadaPorFilas(int[][] matriz) {
		int[][] x = new int[matriz.length][matriz[0].length];
		for(int i = 0; i < matriz.length; i++){
			int[] p = new int[matriz[0].length];
			for(int j = 0; j < matriz[0].length; j++){
				p[j] = matriz[i][j];
			}
			insercion(p);
			for(int j = 0; j < matriz[0].length; j++){
				x[i][j] = p[j];
			}
		}
		return x;
	}

	public static int[][] matrizOrdenadaPorColumnas(int[][] matriz) {
		int[][] x = new int[matriz.length][matriz[0].length];
		for(int j = 0; j < matriz[0].length; j++){
			int[] p = new int[matriz.length];
			for(int i = 0; i < matriz.length; i++){
				p[i] = matriz[i][j];
			}
			insercion(p);
			for(int i = 0; i < matriz.length; i++){
				x[i][j] = p[i];
			}
		}
		return x;
	}
}