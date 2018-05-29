package org.ip.sesion09;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperacionesMatricesCuadradasTestJUnit4 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOperacionesMatricesCuadradas2D() {
		int [][] matrizA = {{2, 4}, {3, 1}};
		int [][] matrizB = {{7, 1}, {5, 2}};
		int [][] matrizC;
		int [][] matrizD = {{1, 2, 3}, {2, 1, 7}, {3, 7, 1}};
		
		String salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizA);
		String salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "2	4" + "\n"
				+ "3	1";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizB);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "7	1" + "\n"
				+ "5	2";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		try {
			matrizC = OperacionesMatricesCuadradas.suma(matrizA, matrizB);
			salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizC);
			salidaEsperadaMatriz = "Matriz:" + "\n"
					+ "9	5" + "\n"
					+ "8	3";
			assertEquals(salidaMatriz, salidaEsperadaMatriz);

			matrizC = OperacionesMatricesCuadradas.resta(matrizB, matrizA);
			salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizC);
			salidaEsperadaMatriz = "Matriz:" + "\n"
					+ "5	-3" + "\n"
					+ "2	1";
			assertEquals(salidaMatriz, salidaEsperadaMatriz);

			matrizC = OperacionesMatricesCuadradas.producto(matrizA, matrizB);
			salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizC);
			salidaEsperadaMatriz = "Matriz:" + "\n"
					+ "34	10" + "\n"
					+ "26	5";
			assertEquals(salidaMatriz, salidaEsperadaMatriz);
			
			int sumaDiagonal = OperacionesMatricesCuadradas.sumaDiagonal(matrizC);
			assertTrue(sumaDiagonal == 39);
			boolean simetrica = OperacionesMatricesCuadradas.esSimetrica(matrizC);
			assertFalse(simetrica);

		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizD);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "1	2	3" + "\n"
				+ "2	1	7" + "\n"
				+ "3	7	1";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		int sumaDiagonal = OperacionesMatricesCuadradas.sumaDiagonal(matrizA);
		assertTrue(sumaDiagonal == 3);
		sumaDiagonal = OperacionesMatricesCuadradas.sumaDiagonal(matrizB);
		assertTrue(sumaDiagonal == 9);
		sumaDiagonal = OperacionesMatricesCuadradas.sumaDiagonal(matrizD);
		assertTrue(sumaDiagonal == 3);
		boolean simetrica = OperacionesMatricesCuadradas.esSimetrica(matrizD);
		assertTrue(simetrica);

		matrizC = OperacionesMatricesCuadradas.producto(matrizD, 3);
		salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizC);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "3	6	9" + "\n"
				+ "6	3	21" + "\n"
				+ "9	21	3";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);
		
		sumaDiagonal = OperacionesMatricesCuadradas.sumaDiagonal(matrizC);
		assertTrue(sumaDiagonal == 9);

		simetrica = OperacionesMatricesCuadradas.esSimetrica(matrizC);
		assertTrue(simetrica);
		
		int [][] matrizTraspuesta = OperacionesMatricesCuadradas.transpuesta(matrizC);
		salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizTraspuesta);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "3	6	9" + "\n"
				+ "6	3	21" + "\n"
				+ "9	21	3";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);
		simetrica = OperacionesMatricesCuadradas.esSimetrica(matrizTraspuesta);
		assertTrue(simetrica);
		boolean equal = OperacionesMatricesCuadradas.equals(matrizC, matrizTraspuesta);
		assertTrue(equal);

		int [] sumaFilas = OperacionesMatricesCuadradas.sumaFilas(matrizC);
		String salidaArray = OperacionesMatricesCuadradas.muestraArray(sumaFilas);
		String salidaEsperadaArray = "Array: [18	30	33]";
		assertEquals(salidaArray, salidaEsperadaArray);

		int [] sumaColumnas = OperacionesMatricesCuadradas.sumaColumnas(matrizC);
		salidaArray = OperacionesMatricesCuadradas.muestraArray(sumaColumnas);
		salidaEsperadaArray = "Array: [18	30	33]";
		assertEquals(salidaArray, salidaEsperadaArray);
		
		int [] menorElemento = OperacionesMatricesCuadradas.elementoMenor(matrizC);
		assertTrue(menorElemento[0] == 0); assertTrue(menorElemento[1] == 0); assertTrue(menorElemento[2] == 3);

		int [] mayorElemento = OperacionesMatricesCuadradas.elementoMayor(matrizC);
		assertTrue(mayorElemento[0] == 1); assertTrue(mayorElemento[1] == 2); assertTrue(mayorElemento[2] == 21);

	}

	@Test
	public void testOperacionesMatricesCuadradas2DAmpliado() {
		int [][] matrizA = {{2, 4, 8}, {3, 9, 27}, {4, 16, 64}};
		int [][] matrizB = {{100, 10, 1}, {75, 25, 5}, {17, 7, 77}};
		int [][] matrizC;
		int [][] matrizD = {{35, 7, 20, 3}, {26, 7, 28, 9}, {16, 37, 33, 10}, {13, 27, 36, 48}};
		
		String salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizA);
		String salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "2	4	8" + "\n"
				+ "3	9	27" + "\n"
				+ "4	16	64";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizB);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "100	10	1" + "\n"
				+ "75	25	5" + "\n"
				+ "17	7	77";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		try {
			matrizC = OperacionesMatricesCuadradas.suma(matrizA, matrizB);
			salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizC);
			salidaEsperadaMatriz = "Matriz:" + "\n"
					+ "102	14	9" + "\n"
					+ "78	34	32" + "\n"
					+ "21	23	141";
			assertEquals(salidaMatriz, salidaEsperadaMatriz);

			matrizC = OperacionesMatricesCuadradas.resta(matrizA, matrizB);
			salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizC);
			salidaEsperadaMatriz = "Matriz:" + "\n"
					+ "-98	-6	7" + "\n"
					+ "-72	-16	22" + "\n"
					+ "-13	9	-13";
			assertEquals(salidaMatriz, salidaEsperadaMatriz);

			matrizC = OperacionesMatricesCuadradas.producto(matrizA, matrizB);
			salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizC);
			salidaEsperadaMatriz = "Matriz:" + "\n"
					+ "636	176	638" + "\n"
					+ "1434	444	2127" + "\n"
					+ "2688	888	5012";
			assertEquals(salidaMatriz, salidaEsperadaMatriz);
			
			int sumaDiagonal = OperacionesMatricesCuadradas.sumaDiagonal(matrizC);
			assertTrue(sumaDiagonal == 6092);
			boolean simetrica = OperacionesMatricesCuadradas.esSimetrica(matrizC);
			assertFalse(simetrica);

		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizD);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "35	7	20	3" + "\n"
				+ "26	7	28	9" + "\n"
				+ "16	37	33	10" + "\n"
				+ "13	27	36	48";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		int sumaDiagonal = OperacionesMatricesCuadradas.sumaDiagonal(matrizA);
		assertTrue(sumaDiagonal == 75);
		sumaDiagonal = OperacionesMatricesCuadradas.sumaDiagonal(matrizB);
		assertTrue(sumaDiagonal == 202);
		sumaDiagonal = OperacionesMatricesCuadradas.sumaDiagonal(matrizD);
		assertTrue(sumaDiagonal == 123);
		boolean simetrica = OperacionesMatricesCuadradas.esSimetrica(matrizD);
		assertFalse(simetrica);
	
		matrizC = OperacionesMatricesCuadradas.producto(matrizD, 7);
		salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizC);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "245	49	140	21" + "\n"
				+ "182	49	196	63" + "\n"
				+ "112	259	231	70" + "\n"
				+ "91	189	252	336";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		sumaDiagonal = OperacionesMatricesCuadradas.sumaDiagonal(matrizC);
		assertTrue(sumaDiagonal == 861);

		simetrica = OperacionesMatricesCuadradas.esSimetrica(matrizC);
		assertFalse(simetrica);
		
		int [][] matrizTraspuesta = OperacionesMatricesCuadradas.transpuesta(matrizC);
		salidaMatriz = OperacionesMatricesCuadradas.muestraMatriz(matrizTraspuesta);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "245	182	112	91" + "\n"
				+ "49	49	259	189" + "\n"
				+ "140	196	231	252" + "\n"
				+ "21	63	70	336";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);
		simetrica = OperacionesMatricesCuadradas.esSimetrica(matrizTraspuesta);
		assertFalse(simetrica);
		boolean equal = OperacionesMatricesCuadradas.equals(matrizC, matrizTraspuesta);
		assertFalse(equal);

		int [] sumaFilas = OperacionesMatricesCuadradas.sumaFilas(matrizC);
		String salidaArray = OperacionesMatricesCuadradas.muestraArray(sumaFilas);
		String salidaEsperadaArray = "Array: [455	490	672	868]";
		assertEquals(salidaArray, salidaEsperadaArray);
	
		int [] sumaColumnas = OperacionesMatricesCuadradas.sumaColumnas(matrizC);
		salidaArray = OperacionesMatricesCuadradas.muestraArray(sumaColumnas);
		salidaEsperadaArray = "Array: [630	546	819	490]";
		assertEquals(salidaArray, salidaEsperadaArray);

		int [] menorElemento = OperacionesMatricesCuadradas.elementoMenor(matrizC);
		assertTrue(menorElemento[0] == 0); assertTrue(menorElemento[1] == 3); assertTrue(menorElemento[2] == 21);

		int [] mayorElemento = OperacionesMatricesCuadradas.elementoMayor(matrizC);
		assertTrue(mayorElemento[0] == 3); assertTrue(mayorElemento[1] == 3); assertTrue(mayorElemento[2] == 336);

	}

}
