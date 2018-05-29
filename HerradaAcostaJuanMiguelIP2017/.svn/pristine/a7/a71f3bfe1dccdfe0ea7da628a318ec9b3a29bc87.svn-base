package org.ip.sesion04;

import java.util.Scanner;

public class ValidarFecha {
	
	public static boolean esFechaCorrecta(int dia, int mes, int anio){
		boolean fechaCorrecta = false;
		switch (mes){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia >=1 && dia <= 31)
				fechaCorrecta = true;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia >=1 && dia <= 30)
				fechaCorrecta = true;
			break;
		case 2:
			if (esBisiesto(anio)){
				if (dia >=1 && dia <= 29)
					fechaCorrecta = true;
			}else{
				if (dia >=1 && dia <= 28)
					fechaCorrecta = true;
			}
				break;
		default:
			fechaCorrecta = false;
		}
		return fechaCorrecta;
	}
	
	public static boolean esBisiesto(int anio){
		boolean correcto= true;
		if ((anio % 4 == 0)&& (anio % 100 != 0) || (anio % 400 == 0)){
			correcto = true;
			} else {
			correcto = false;
			}
		return correcto;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		boolean correcta;
		do{
			System.out.println("Introduce el día");
			int dia = entrada.nextInt();
			System.out.println("Introduce el mes");
			int mes = entrada.nextInt();
			System.out.println("Introduce el año");
			int anio = entrada.nextInt();
			correcta = esFechaCorrecta(dia,mes,anio);
			if (correcta)
				System.out.println("Fecha Correcta");
			else
				System.out.println("Fecha Incorrecta, Introduzaca nuevos valores");
		}while(!correcta);
		
		entrada.close();
	}

}
