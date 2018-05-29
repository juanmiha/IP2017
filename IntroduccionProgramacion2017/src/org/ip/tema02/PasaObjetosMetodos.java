package org.ip.tema02;

public class PasaObjetosMetodos {

	private static void cambiarNombre(Persona p) {
        //p = new Persona(); 		// nuevo valor al parametro
        p.setNombre("Antonio"); 	// aqui tendrá otro valor
        System.out.println("El nombre en el método es: " + p.getNombre());
    }
	
	public static void main(String[] args) {
		Persona p = new Persona();	// creamos un objeto
		p.setNombre("Juan"); 		// le asignamos un valor
		System.out.println("El nombre antes del método es: " + p.getNombre());
		cambiarNombre(p);			// llamamos a un método para que cambie de valor
		System.out.println("El nombre después del método es: " + p.getNombre());
	}

}
