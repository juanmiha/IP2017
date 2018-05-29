package org.ip.sesion06;

public class TestObjetosGeometricos {

	public static void main(String[] args) {

		CirculoHer circulo = new CirculoHer(1.0);
		System.out.println("Un " + circulo.toString());
		System.out.println("El color es " + circulo.getColor());
		System.out.println("El radio es " + circulo.getRadio());
		System.out.println("La fecha de creacion es " + circulo.getFechaCreacion());
		System.out.println("El area es " + circulo.calcularArea());
		System.out.println("El diametro es " + circulo.calcularDiametro());
		System.out.println("El perimetro es " + circulo.calcularPerimetro());
		System.out.println("* Datos del circulo son: ");
		circulo.mostrarCirculo();
		circulo.desplazar(1.0, 2.0);
		circulo.setColor("negro");
		circulo.setRadio(5.0);
		System.out.println("* Datos del circulo modificado son: ");
		circulo.mostrarCirculo();

		RectanguloHer rectangulo = new RectanguloHer(2.0, 4.0);
		System.out.println("\nUn " + rectangulo.toString());
		System.out.println("El area es " + rectangulo.calcularArea());
		System.out.println("El perimetro es " + rectangulo.calcularPerimetro());
		System.out.println("* Datos del rectangulo son: ");
		rectangulo.mostrarRectangulo();
		rectangulo.desplazar(3.0, 4.0);
		rectangulo.setColor("verde");
		rectangulo.setRelleno(true);
		rectangulo.setAncho(3.0);
		rectangulo.setAlto(8.0);
		System.out.println("* Datos del rectangulo modificado son: ");
		rectangulo.mostrarRectangulo();

		TrianguloHer triangulo = new TrianguloHer(4.0, 4.0, 6.0);
		System.out.println("\nUn " + triangulo.toString());
		System.out.println("El area es " + triangulo.calcularArea());
		System.out.println("El perimetro es " + triangulo.calcularPerimetro());
		System.out.println("* Datos del triangulo son: ");
		triangulo.mostrarTriangulo();
		triangulo.setLongitudLado3(2.0);
		triangulo.setColor("azul");
		triangulo.setRelleno(true);
		System.out.println("* Datos del triangulo modificado son: ");
		triangulo.mostrarTriangulo();
		System.out.println("El area es " + triangulo.calcularArea());
		System.out.println("El perimetro es " + triangulo.calcularPerimetro());

		CuadradoHer cuadrado = new CuadradoHer(5.0);
		System.out.println("\nUn " + cuadrado.toString());
		System.out.println("El area es " + cuadrado.calcularArea());
		System.out.println("El perimetro es " + cuadrado.calcularPerimetro());
		System.out.println("* Datos del cuadrado son: ");
		cuadrado.mostrarRectangulo();
		cuadrado.desplazar(3.0, 4.0);
		cuadrado.setColor("rojo");
		cuadrado.setRelleno(true);
		cuadrado.setAncho(3.0);
		cuadrado.setAlto(3.0); 
		System.out.println("* El valor del lado del cuadrado es: " + cuadrado.getAlto());
		System.out.println("El area es " + cuadrado.calcularArea());
		System.out.println("Un " + cuadrado.toString());
		cuadrado.setAlto(8.0);
		cuadrado.setAncho(8.0);
		System.out.println("* El valor del lado del cuadrado es: " + cuadrado.getAncho());
		System.out.println("El perimetro es " + cuadrado.calcularPerimetro());
		System.out.println("* Datos del cuadrado modificado son: ");
		cuadrado.mostrarRectangulo();
		System.out.println("Un " + cuadrado.toString());

	}

}