package org.ip.sesion02;

public class DiaJuliano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia = 2;
		int mes = 12;
		int diajuliano;
		switch(mes){
		case 1:
			diajuliano = dia;
			System.out.println("El día juliano correspondiente al día " + dia + " del mes " + mes + " es " + diajuliano);
			break;
		case 2:
			diajuliano = dia + 31;
			System.out.println("El día juliano correspondiente al día " + dia + " del mes " + mes + " es " + diajuliano);
			break;
		case 3:
			diajuliano = dia + 59;
			System.out.println("El día juliano correspondiente al día " + dia + " del mes " + mes + " es " + diajuliano);
			break;
		case 4:
			diajuliano = dia + 90;
			System.out.println("El día juliano correspondiente al día " + dia + " del mes " + mes + " es " + diajuliano);
			break;
		case 5:
			diajuliano = dia + 120;
			System.out.println("El día juliano correspondiente al día " + dia + " del mes " + mes + " es " + diajuliano);
			break;
		case 6:
			diajuliano = dia + 151;
			System.out.println("El día juliano correspondiente al día " + dia + " del mes " + mes + " es " + diajuliano);
			break;
		case 7:
			diajuliano = dia + 181;
			System.out.println("El día juliano correspondiente al día " + dia + " del mes " + mes + " es " + diajuliano);
			break;
		case 8:
			diajuliano = dia + 212;
			System.out.println("El día juliano correspondiente al día " + dia + " del mes " + mes + " es " + diajuliano);
			break;
		case 9:
			diajuliano = dia + 242;
			System.out.println("El día juliano correspondiente al día " + dia + " del mes " + mes + " es " + diajuliano);
			break;
		case 10:
			diajuliano = dia + 273;
			System.out.println("El día juliano correspondiente al día " + dia + " del mes " + mes + " es " + diajuliano);
			break;
		case 11:
			diajuliano = dia + 303;
			System.out.println("El día juliano correspondiente al día " + dia + " del mes " + mes + " es " + diajuliano);
			break;
		case 12:
			diajuliano = dia + 334;
			System.out.println("El día juliano correspondiente al día " + dia + " del mes " + mes + " es " + diajuliano);
			break;
		default:
			System.out.println("El día o el mes introducidos son incorrectos");
		}
	}

}
