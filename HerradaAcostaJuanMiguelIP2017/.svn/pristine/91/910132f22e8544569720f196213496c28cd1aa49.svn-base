package org.ip.sesion02;

public class TarifaTaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int km = 101;
		double importe;
		if (km <= 30){
			importe = 18;
			System.out.println("Kilometros recorrídos => " + km);
			System.out.println("El importe total a pagar es " + importe + " €");
		}else if(km > 30 || km < 100){
			importe =((km - 30) * 0.85) + 18;
			System.out.println("Kilometros recorrídos => " + km);
			System.out.printf("El importe total a pagar es %4.2f" , importe);
			System.out.println(" €");
		}else if (km > 100){
			importe =((km - 100)* 0.65) + ((km - 30) * 0.85) + 18;
			System.out.println("Kilometros recorrídos => " + km);
			System.out.printf("El importe total a pagar es %4.2f" , importe);
			System.out.println(" €");
		}
	}

}
