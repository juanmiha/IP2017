package org.ip.sesion04;

public class SumaSerie {
	
	public static double sumaSerie(int i){
		if (i == 0) 
			return 0;
		else
			return (i /(i+1.0))+ sumaSerie(i - 1);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		System.out.printf("i\t");
		System.out.print("Suma");
		while (i <= 10){
			System.out.printf("\n"+"%s\t%.6f",i,sumaSerie(i));
			i ++;
		}
	}

}
