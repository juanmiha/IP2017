package org.ip.sesion09;

public class MatrizEnteros implements Comparable<Object> {
private int [][] matriz;

	public MatrizEnteros(int numeroFilas, int numeroColumnas) {
		matriz = new int [numeroFilas][numeroColumnas];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = i + j;
			}
		}
	}

	public MatrizEnteros(int[][] matriz) {
		this.matriz = new int [matriz.length][matriz[0].length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				this.matriz[i][j] = matriz[i][j];
			}
		}
	}

	public MatrizEnteros(MatrizEnteros matrizEnteros) {
		matriz = new int [matrizEnteros.getNumeroDeFilas()][matrizEnteros.getNumeroDeColumnas()];
		for (int i = 0; i < matrizEnteros.getNumeroDeFilas(); i++) {
			for (int j = 0; j < matrizEnteros.getNumeroDeColumnas(); j++) {
				matriz[i][j] = matrizEnteros.getValorElemento(i, j);
			}
		}
	}

	public int [][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int valor) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = valor;
			}
		}
	}

	public int getNumeroDeFilas() {
		return matriz.length;
	}

	public int getNumeroDeColumnas() {
		return matriz[0].length;
	}

	public int getValorElemento(int fila, int columna) {
		if ((fila < 0) || (fila > matriz.length - 1)) throw new RuntimeException("Valor de fila fuera de rango");
		if ((columna < 0) || (columna > matriz[0].length - 1)) throw new RuntimeException("Valor de columna fuera de rango");
		return matriz[fila][columna];
	}

	public boolean setValorElemento(int fila, int columna, int valor) {
		if ((fila < 0) || (fila > matriz.length - 1))
			return false;
		if ((columna < 0) || (columna > matriz[0].length - 1))
			return false;
		matriz[fila][columna] = valor;
		return true;
	}

	public double getMedia() {
		int sum = 0;
		int numberOfElements = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				sum += matriz[i][j];
				numberOfElements++;
			}
		}
		return (double)sum / (double)numberOfElements;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (!(obj instanceof MatrizEnteros))
			return false;
		MatrizEnteros other = (MatrizEnteros) obj;

		if (matriz.length != other.getNumeroDeFilas())
			return false;
		if (matriz[0].length != other.getNumeroDeColumnas())
			return false;
		boolean equal = true;
		for (int i = 0; (i < matriz.length) && (equal); i++) {
			for (int j = 0; (j < matriz[i].length) && (equal); j++) {
				if (matriz[i][j] != other.getValorElemento(i, j))
					equal = false;
			}
		}
		return equal;
	}
	public String toString() {
		String salida = "MatrizEnteros:\n";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j != matriz[i].length - 1)
					salida += matriz[i][j] + "\t";
				else
					salida += matriz[i][j];
			}
			if (i != matriz.length - 1)
				salida += "\n";
		}
		return salida;
	}

	public int compareTo(Object o) {
		MatrizEnteros otraMatriz = (MatrizEnteros)o;
		if (this.getMedia() > otraMatriz.getMedia()){
			return 1;
		}
		else if (this.getMedia() < otraMatriz.getMedia()){
			return -1;
		}
		else
			return 0;
	}

}

