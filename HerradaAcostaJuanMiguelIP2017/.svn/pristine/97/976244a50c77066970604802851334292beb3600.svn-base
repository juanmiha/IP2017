package org.ip.sesion09;

public class MatricesBinarias {
	public static boolean esBinaria(int [][] matriz) {
		boolean binaria = true;
		for(int fila = 0; fila < matriz.length;fila++)
			for(int columna = 0; columna < matriz[0].length;columna++)
				if(matriz[fila][columna] != 0 && matriz[fila][columna] != 1)
					binaria = false;
		return binaria;
	}
	public static int[][] transformaBinaria(int[][] a){
		int [][] b =new int[a.length][a[0].length];
		for (int fila = 0;fila < a.length;fila++){
			for(int columna = 0; columna < a[fila].length;columna++){
				b[fila][columna] = a[fila][columna]%2;
				}
			}
		return b;
	}
	public static int[] mayorNumeroDeUnos(int[][] a){
		int [] b = new int[2];
		int contF, contC;
		int maxF = 0, maxC = 0;
		for(int i = 0; i < a.length; i++){
			contF = 0;
			for(int j = 0; j < a[0].length; j++){
				if(a[i][j] == 1){
					contF++;
				}
			}
			//ACTUALIZACIÓN DE LOS CONTADORES
			if(contF > maxF){ 
				maxF = contF;
				b[0] = i;
			}
		}
		for(int j = 0; j < a[0].length; j++){
			contC = 0;
			for(int i = 0; i < a.length; i++){
				if(a[i][j] == 1){
					contC++;
				}
			}
			//ACTUALIZACIÓN DE LOS CONTADORES
			if(contC > maxC){
				maxC = contC;
				b[1] = j;
			}
		}
		return b;
	}
	public static int[] numeroFilasColumnasMismoValor(int[][] a){
		int[] b = new int[4];
		boolean FT0, FT1, CT0,CT1;
		for(int i = 0; i < a.length; i++){
			FT0 = true;
			FT1 = true;
			for(int j = 0; j < a[0].length; j++){
				if(!FT0 && !FT1) break;
				if(FT0 && a[i][j] != 0){
					FT0 = false;
				}
				if(FT1 && a[i][j] != 1){
					FT1 = false;
				}
			}
			if(FT0){
				b[0]++;
			}
			else if(FT1){
					b[1]++;
			}
		}
		for(int j = 0; j < a.length; j++){
			CT0 = true;
			CT1 = true;
			for(int i = 0; i < a[0].length; i++){
				if(!CT0 && !CT1) break;
				if(CT0 && a[i][j] != 0){
					CT0 = false;
				}
				if(CT1 && a[i][j] != 1){
					CT1 = false;
				}
			}
			if(CT0){
				b[2]++;
			}
			else if(CT1){
					b[3]++;
			}
		}	
		return b;
	}
	public static boolean numeroImparUnos(int[][] a){
		boolean parCeros = true;
		int contador = 0;
		for (int fila = 0;fila < a.length;fila++){
			for(int columna = 0; columna < a[fila].length;columna++){
				if(a[fila][columna] == 1)
					contador ++;
			}
		}
		if (contador%2 == 0)
			parCeros = false;
		return parCeros;
	}
	public static boolean numeroParCeros(int[][] a){
		boolean parCeros = true;
		int contador = 0;
		for (int fila = 0;fila < a.length;fila++){
			for(int columna = 0; columna < a[fila].length;columna++){
				if(a[fila][columna] == 0)
					contador ++;
			}
		}
		if (contador%2 != 0)
			parCeros = false;
		return parCeros;
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
	public static int[] valoresFilasDecimal(int[][] a) {
		int[] b = new int[a.length];
		String s;
		for(int i = 0; i < a.length; i++){
			s = "";
			for(int j = 0; j < a[0].length; j++){
				s += a[i][j];
			}
			b[i] = Integer.parseInt(s, 2);
		}
	
	return b;
}

	public static int[] valoresColumnasDecimal(int[][] a) {
		int[] b = new int[a.length];
		String s;
		for(int j = 0; j < a[0].length; j++){
			s = "";
			for(int i = 0; i < a.length; i++){
				s += a[i][j];
			}
			b[j] = Integer.parseInt(s,2);
		}
		return b;
	}
	public static String muestraMatriz(int[][] a){
		String salida = "Matriz Binaria:\n";
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
