package org.ip.sesion03;

public class EstimarPI {
	public static double CalculoPi(int num){
		double denominador = 1;
		double resultado = 0;
		for (int i=0;i<=num;i++){
			if(i%2==0)
				resultado = resultado + (1/denominador);
			else
				resultado = resultado - (1/denominador);
			denominador = denominador+2;
		}
		return (resultado*4.0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.printf("i\t\t   Pi(i)\n");
		System.out.println("---------------------------");
		System.out.println();
		System.out.printf("101\t\t%.8f",CalculoPi(101));
		System.out.println();
		System.out.printf("201\t\t%.8f",CalculoPi(201));
		System.out.println();
		System.out.printf("301\t\t%.8f",CalculoPi(301));
		System.out.println();
		System.out.printf("401\t\t%.8f",CalculoPi(401));
		System.out.println();
		System.out.printf("501\t\t%.8f",CalculoPi(501));
		System.out.println();
		System.out.printf("601\t\t%.8f",CalculoPi(601));
		System.out.println();
		System.out.printf("701\t\t%.8f",CalculoPi(701));
		System.out.println();
		System.out.printf("801\t\t%.8f",CalculoPi(801));
		System.out.println();
		System.out.printf("901\t\t%.8f",CalculoPi(901));
		System.out.println();
		System.out.println();
		int precision= 1000;
		System.out.println("Precisión =     "+precision);
		System.out.printf("miPI = \t\t%.15f",CalculoPi(precision));
		System.out.println();
		System.out.printf("Math.PI = \t%.15f",Math.PI);
	}

}
