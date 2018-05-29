package org.ip.sesion09;

public class OperacionesMatricesCuadradas {
	public static boolean esSimetrica(int [][] matriz) {
		boolean simetria = true;
		int fila = 0; int columna;
		while (simetria && (fila < matriz.length)) {
			columna = 0;
			while (simetria && (columna < matriz[fila].length)) {
				if (matriz[fila][columna] != matriz[columna][fila])
					simetria = false;
				columna++;
			}
			fila++;
		}
		return simetria;
	}
	public static int sumaDiagonal(int[][] a){
		int sumadiagonal = 0;
		for (int fila = 0;fila < a.length;fila++){
			for(int columna = 0; columna < a[fila].length;columna++){
				if(fila==columna){
					sumadiagonal += a[fila][columna];
				}
			}
		}
		return sumadiagonal;
	}
	public static int[][] suma(int[][] a,int[][] b){
		int dimension1 = a.length;
		int dimension2 = a[0].length;
		int [][] resultado = new int [dimension1][dimension2];
		for (int fila = 0;fila < a.length;fila++){
			for(int columna = 0; columna < a[fila].length;columna++){
				resultado[fila][columna]=a[fila][columna]+b[fila][columna];
			}
		}
		return resultado;
	}
	public static int[][] resta(int[][] a,int[][] b){
		int dimension1 = a.length;
		int dimension2 = a[0].length;
		int [][] resultado = new int [dimension1][dimension2];
		for (int fila = 0;fila < a.length;fila++){
			for(int columna = 0; columna < a[fila].length;columna++){
				resultado[fila][columna]=a[fila][columna]-b[fila][columna];
			}
		}
		return resultado;
	}
	public static int[][] producto(int[][] a,int[][] b){
		int dimension1 = a.length;
		int dimension2 = a[0].length;
		int [][] resultado = new int [dimension1][dimension2];
		for (int fila = 0;fila < a.length;fila++){
			for(int columna = 0; columna < b.length;columna++){
				resultado[fila][columna]=0;
				for(int k = 0;k < b.length;k++)
					resultado[fila][columna]+=a[fila][k]*b[k][columna];
			}
		}
		return resultado;
	}
	public static int[][] producto(int[][] a,int d){
		int dimension1 = a.length;
		int dimension2 = a[0].length;
		int [][] resultado = new int [dimension1][dimension2];
		for (int fila = 0;fila < a.length;fila++){
			for(int columna = 0; columna < a[fila].length;columna++){
				resultado[fila][columna]=a[fila][columna]*d;
			}
		}
		return resultado;
	}
	public static int[][] transpuesta(int[][] a){
		int [][] transpuesta = new int [a.length][a[0].length];
		for (int fila = 0;fila < a.length;fila++){
			for(int columna = 0; columna < a[fila].length;columna++){
				if(fila == columna)
					transpuesta[fila][columna]=a[fila][columna];
				else
					transpuesta[fila][columna]=a[columna][fila];
			}
		}
		return transpuesta;
	}
	public static int[] sumaFilas(int[][] a){
		int[] sumaFilas =new int [a.length];
		for (int fila = 0;fila < a.length;fila++){
			sumaFilas[fila] = 0 ;
			for(int columna = 0; columna < a[fila].length;columna++){
				sumaFilas[fila]+=a[fila][columna];
			}
		}
		return sumaFilas;
	}
	public static int[] sumaColumnas(int[][] a){
		int[] sumaColumnas =new int [a.length];
		for (int fila = 0;fila < a.length;fila++){
			sumaColumnas[fila] = 0 ;
			for(int columna = 0; columna< a[0].length;columna++){
				sumaColumnas[fila]+=a[columna][fila];
			}
		}
		return sumaColumnas;
	}
	public static int[] elementoMenor(int[][] a){
		int[] elementoMenor = new int[3];
		int filaMenor = 0;
		int columnaMenor = 0;
		int menor = a[0][0];
		for (int fila = 0;fila < a.length;fila++){
			for(int columna = 0;columna<a[0].length;columna++){
				if (menor > a[fila][columna]){
					menor = a[fila][columna];
					filaMenor = fila;
					columnaMenor = columna;
				}
			}
		}
		elementoMenor[2] = a[filaMenor][columnaMenor];
		elementoMenor[0] = filaMenor;
		elementoMenor[1] = columnaMenor;
		return elementoMenor;
	}
	public static int[] elementoMayor(int[][] a){
		int[] elementoMayor = new int[3];
		int filaMayor = 0;
		int columnaMayor = 0;
		int mayor = a[0][0];
		for (int fila = 0;fila < a.length;fila++){
			for(int columna = 0;columna <a[0].length;columna++){
				if (mayor < a[fila][columna]){
					mayor = a[fila][columna];
					filaMayor = fila;
					columnaMayor = columna;
				}
			}
		}
		elementoMayor[2] = a[filaMayor][columnaMayor];
		elementoMayor[0] = filaMayor;
		elementoMayor[1] = columnaMayor;
		return elementoMayor;
	}
	public static boolean equals(int[][] a,int[][] b){
		boolean equals = true;
		for (int fila = 0;fila < a.length;fila++){
			for(int columna = 0;columna<a[0].length;columna++){
				if (a[fila][columna] != b[fila][columna])
					equals = false;
			}
		}
		return equals;
	}
	public static String muestraMatriz(int[][] a){
		String salida = "Matriz:\n";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j != a[i].length - 1)
					salida += a[i][j] + "\t";
				else
					salida += a[i][j];
			}
			if (i != a.length - 1)
				salida += "\n";
		}
		return salida;
	}
	public static String muestraArray(int[] a){
        String mostrar = "Array: [";
        for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1)
				mostrar += a[i] + "\t";
			else
				mostrar += a[i];
		}
		mostrar += "]";
		return mostrar;
    }
}

