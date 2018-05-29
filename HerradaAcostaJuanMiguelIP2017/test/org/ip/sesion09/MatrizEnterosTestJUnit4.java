package org.ip.sesion09;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatrizEnterosTestJUnit4 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMatrizEnteros() {
		int [][] matriz1 = {{2, 4}, {3, 1}};
		int [][] matriz2 = {{35, 7, 20, 3}, {26, 7, 28, 9}, {16, 37, 33, 10}, {13, 27, 36, 48}};

		MatrizEnteros objetoMatriz1 = new MatrizEnteros(matriz1);
		MatrizEnteros objetoMatriz2 = new MatrizEnteros(matriz2);
		MatrizEnteros objetoMatriz3 = new MatrizEnteros(3, 3);

		String salidaMatriz = objetoMatriz1.toString();
		String salidaEsperadaMatriz = "MatrizEnteros:\n"
				+ "2	4" + "\n"
				+ "3	1";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		salidaMatriz = objetoMatriz2.toString();
		salidaEsperadaMatriz = "MatrizEnteros:\n"
				+ "35	7	20	3" + "\n"
				+ "26	7	28	9" + "\n"
				+ "16	37	33	10" + "\n"
				+ "13	27	36	48";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		salidaMatriz = objetoMatriz3.toString();
		salidaEsperadaMatriz = "MatrizEnteros:\n"
				+ "0	1	2" + "\n"
				+ "1	2	3" + "\n"
				+ "2	3	4";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		assertTrue(objetoMatriz1.getNumeroDeFilas() == 2);
		assertTrue(objetoMatriz2.getNumeroDeColumnas() == 4);
		assertTrue(objetoMatriz2.getValorElemento(2, 3) == 10);
		assertTrue(objetoMatriz3.getValorElemento(1, 2) == 3);
		assertTrue(objetoMatriz3.setValorElemento(1, 2, 7));
		assertTrue(objetoMatriz3.getValorElemento(1, 2) == 7);
		assertTrue(objetoMatriz3.setValorElemento(1, 2, 3));

		assertTrue(objetoMatriz1.getMedia() == 2.5);
		assertTrue(objetoMatriz3.getMedia() == 2.0);

		MatrizEnteros objetoMatriz4 = new MatrizEnteros(7, 7);
		assertTrue(objetoMatriz4.getMedia() == 6.0);
		objetoMatriz4.setMatriz(7);
		assertTrue(objetoMatriz4.getMedia() == 7.0);

		assertTrue(objetoMatriz1.equals(objetoMatriz2) == false);

		assertTrue(objetoMatriz2.compareTo(objetoMatriz1) == 1);
		assertTrue(objetoMatriz3.compareTo(objetoMatriz1) == -1);

		MatrizEnteros objetoMatriz5 = new MatrizEnteros(objetoMatriz2);
		assertTrue(objetoMatriz2.compareTo(objetoMatriz5) == 0);
		assertTrue(objetoMatriz5.equals(objetoMatriz2) == true);
	}

}