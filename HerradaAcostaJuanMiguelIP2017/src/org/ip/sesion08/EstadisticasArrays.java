package org.ip.sesion08;

public class EstadisticasArrays {
	public static double max(double[] array){
		double maximo = array[0];
		for (int i = 1;i<array.length;i++){
			if(maximo <= array[i]){
				maximo = array[i];
			}
		}
		return maximo;
	}
	public static double max(double[] array,int inferior,int superior){
		double maximo = array[inferior];
		for (int i = inferior + 1;i<=superior;i++){
			if(maximo <= array[i]){
				maximo = array[i];
			}
		}
		return maximo;
	}
	public static int max(int[] array){
		int maximo = array[0];
		for (int i = 1;i<array.length;i++){
			if(maximo <= array[i]){
				maximo = array[i];
			}
		}
		return maximo;
	}
	public static int max(int[] array,int inferior,int superior){
		int maximo = array[inferior];
		for (int i = inferior + 1;i<=superior;i++){
			if(maximo <= array[i]){
				maximo = array[i];
			}
		}
		return maximo;
	}
	public static double min(double[] array){
		double minimo = array[0];
		for (int i = 1;i<array.length;i++){
			if(minimo >= array[i]){
				minimo = array[i];
			}
		}
		return minimo;
	}
	public static double min(double[] array,int inferior,int superior){
		double minimo = array[inferior];
		for (int i = inferior + 1;i<=superior;i++){
			if(minimo >= array[i]){
				minimo = array[i];
			}
		}
		return minimo;
	}
	public static int min(int[] array){
		int minimo = array[0];
		for (int i = 1;i<array.length;i++){
			if(minimo >= array[i]){
				minimo = array[i];
			}
		}
		return minimo;
	}
	public static int min(int[] array,int inferior,int superior){
		int minimo = array[inferior];
		for (int i = inferior + 1;i<=superior;i++){
			if(minimo >= array[i]){
				minimo = array[i];
			}
		}
		return minimo;
	}
	public static double media(double[] array){
		double suma = 0.0, media;
		for (int i = 0; i < array.length; i++) {
		suma += array[i] ;
		}
		media = suma / array.length;
		return media;
	}
	public static double media(double[] array,int inferior,int superior){
		double suma = 0.0;
		int elementos = superior - inferior +1;
		if (inferior < 0 || superior >= array.length || inferior >superior)
			 throw new RuntimeException ("Indices del subarray fuera de rango");
		for (int i = inferior; i <= superior; i++) {
		suma += array[i] ;
		}

		return suma / elementos;
	}
	public static double media(int[] array){
		double suma = 0.0, media;
		for (int i = 0; i < array.length; i++) {
		suma += array[i] ;
		}
		media = suma / array.length;
		return media;
	}
	public static double media(int[] array,int inferior,int superior){
		double suma = 0.0;
		int elementos = superior - inferior +1;
		if (inferior < 0 || superior >= array.length || inferior >superior)
		 throw new RuntimeException ("Indices del subarray fuera de rango");
		for (int i = inferior; i <= superior; i++) {
		suma += array[i] ;
		}
		return suma / elementos;
	}
	public static double var(double[] array){
		double varianza = 0.0;
		double rango;
		for(int i = 0 ; i<array.length; i++){
			rango = Math.pow(array[i]-media(array),2);
			varianza = varianza + rango;
		}
		return varianza/(array.length-1);
	}
	public static double var(double[] array,int inferior,int superior){
		double varianza = 0.0;
		double rango;
		int elementos = superior - inferior +1;
		double[] arrayb=new double[elementos];
		for (int i = inferior,j = 0;i<=superior;i++,j++){
			arrayb[j]=array[i];
		}
		for(int i = 0; i<arrayb.length; i++){
			rango = Math.pow(arrayb[i]-media(arrayb),2);
			varianza = varianza + rango;
		}
		return varianza/(elementos-1);
	}
	public static double var(int[] array){
		double varianza = 0.0;
		double rango;
		for(int i = 0 ; i<array.length; i++){
			rango = Math.pow(array[i]-media(array),2);
			varianza = varianza + rango;
		}
		return varianza/(array.length-1);
	}
	public static double var(int[] array,int inferior,int superior){
		double varianza = 0.0;
		double rango;
		int elementos = superior - inferior +1;
		int[] arrayb=new int[elementos];
		for (int i = inferior,j = 0;i<=superior;i++,j++){
			arrayb[j]=array[i];
		}
		for(int i = 0; i<arrayb.length; i++){
			rango = Math.pow(arrayb[i]-media(arrayb),2);
			varianza = varianza + rango;
		}
		return varianza/(elementos-1);
	}
	public static double stdDev(double[] array){
		double varianza = 0.0;
		double rango;
		for(int i = 0 ; i<array.length; i++){
			rango = Math.pow(array[i]-media(array),2);
			varianza = varianza + rango;
		}
		return Math.sqrt(varianza/(array.length-1));
	}
	public static double stdDev(double[] array,int inferior,int superior){
		double varianza = 0.0;
		double rango;
		int elementos = superior - inferior +1;
		double[] arrayb=new double[elementos];
		for (int i = inferior,j = 0;i<=superior;i++,j++){
			arrayb[j]=array[i];
		}
		for(int i = 0; i<arrayb.length; i++){
			rango = Math.pow(arrayb[i]-media(arrayb),2);
			varianza = varianza + rango;
		}
		return Math.sqrt(varianza/(elementos-1));
	}
	public static double stdDev(int[] array){
		double varianza = 0.0;
		double rango;
		for(int i = 0 ; i<array.length; i++){
			rango = Math.pow(array[i]-media(array),2);
			varianza = varianza + rango;
		}
		return Math.sqrt(varianza/(array.length-1));
	}
	public static double stdDev(int[] array,int inferior,int superior){
		double varianza = 0.0;
		double rango;
		int elementos = superior - inferior +1;
		int[] arrayb=new int[elementos];
		for (int i = inferior,j = 0;i<=superior;i++,j++){
			arrayb[j]=array[i];
		}
		for(int i = 0; i<arrayb.length; i++){
			rango = Math.pow(arrayb[i]-media(arrayb),2);
			varianza = varianza + rango;
		}
		return Math.sqrt(varianza/(elementos-1));
	}
	public static String mostrarArray(int[] a){
		String mostrar = "Array de Enteros: ";
        for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1)
				mostrar += a[i] + "\t";
			else
				mostrar += a[i];
		}
		return mostrar;
    }
	public static String mostrarArray(double[] a){
		String mostrar = "Array de Reales: ";
        for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1)
				mostrar += a[i] + "\t";
			else
				mostrar += a[i];
		}
		return mostrar;
    }
}
