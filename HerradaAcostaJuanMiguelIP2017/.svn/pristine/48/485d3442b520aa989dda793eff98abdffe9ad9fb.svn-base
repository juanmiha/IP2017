package org.ip.sesion07;

public class TestCirculoConExcepcion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{
			CirculoConExcepcion circu = new CirculoConExcepcion(1.0,1.0,2.0);
			CirculoConExcepcion circu1 = new CirculoConExcepcion(1.0,1.0,-5.0);
			CirculoConExcepcion circu2 = new CirculoConExcepcion(1.0,1.0,4.0);
		}catch(IllegalArgumentException exp){
			System.out.println(exp);
		}
		System.out.println("Números de circulos creados " + CirculoConExcepcion.getNumCirculos());
		CirculoConExcepcion circu3 = new CirculoConExcepcion(1.0,1.0,1.0);
		try{
			circu3.cambiarTamaño(-8);
		}catch(IllegalArgumentException exp){
			System.out.println(exp);
		}
		System.out.println("Números de circulos creados " + CirculoConExcepcion.getNumCirculos());
	}

}
