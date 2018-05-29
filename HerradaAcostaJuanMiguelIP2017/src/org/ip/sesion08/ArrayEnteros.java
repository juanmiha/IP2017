package org.ip.sesion08;


public class ArrayEnteros  implements Comparable<Object>{
	private int[] array;

	public ArrayEnteros(int numeroElementos){
		this.array =new int[numeroElementos];
		for (int i = 0;i<numeroElementos;i++){
			this.array[i]=i;
		}
	}
	public ArrayEnteros(int[] array){
		this.array=array;
	}
	public ArrayEnteros(ArrayEnteros ArrayEnteros){
		array = new int [ArrayEnteros.getNumeroElementos()];
		for (int i = 0; i < ArrayEnteros.getNumeroElementos(); i++) {
		array[i] = ArrayEnteros.getValorElemento(i);
		}
	}
	public int[] getArray() {
		return array;
	}
	public void setArray(int valor) {
		for(int i=0;i<array.length;i++)
			array[i] = valor;
	}
	public int getNumeroElementos(){
		return array.length;
	}
	public int getValorElemento(int posicion){
		if ((posicion < 0) || (posicion > array.length - 1)) throw new RuntimeException("Valor de posicio fuera de rango");
			return array[posicion];
	}
	public boolean setValorElemento(int posicion,int valor){
		if ((posicion < 0) || (posicion > array.length - 1))
			return false;
		array[posicion] = valor;
		return true;
	}
	public int getRangoValores(){
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
		if (array[i] < minValue)
			minValue = array[i];
		if (array[i] > maxValue)
			maxValue = array[i];
		}
		return maxValue - minValue;

	}
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (!(obj instanceof ArrayEnteros))
			return false;
		ArrayEnteros other = (ArrayEnteros) obj;
		if (array.length != other.getNumeroElementos())
			return false;
		boolean equal = true;
		for (int i = 0; (i < array.length) && (equal); i++) {
			if (array[i] != other.getValorElemento(i))
				equal = false;
		}
		return equal;
	}
	public String toString(){
		String mostrar = "ArrayEnteros: [";
        for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1)
				mostrar += array[i] + "\t";
			else
				mostrar += array[i];
		}
		mostrar += "]";
		return mostrar;
	}
	public int compareTo(Object obj) {
		ArrayEnteros otraMatriz = (ArrayEnteros)obj;
		if (this.getRangoValores() > otraMatriz.getRangoValores()){
			return 1;
		}else if (this.getRangoValores() < otraMatriz.getRangoValores()){
			return -1;
		}else
			return 0;
		}
}
