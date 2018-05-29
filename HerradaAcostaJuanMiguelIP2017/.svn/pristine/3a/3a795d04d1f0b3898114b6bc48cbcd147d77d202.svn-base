package org.ip.sesion10;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrdenacionBiDimensionalTestJUnit4 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOrdenacionBiDimensional() {
		int [][] matriz = {{35, 7, 20, 3, 12, 91, 69}, {26, 17, 28, 43, 5, 83, 67},
				{16, 77, 33, 10, 37, 8, 1}, {13, 27, 36, 48, 54, 9, 4},
				{25, 6, 11, 70, 81, 95, 50}, {2, 88, 14, 15, 21, 19, 29}};

		String salidaMatriz = OrdenacionBiDimensional.muestraMatriz(matriz);
		String salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "35	7	20	3	12	91	69" + "\n"
				+ "26	17	28	43	5	83	67" + "\n"
				+ "16	77	33	10	37	8	1" + "\n"
				+ "13	27	36	48	54	9	4" + "\n"
				+ "25	6	11	70	81	95	50" + "\n"
				+ "2	88	14	15	21	19	29";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		int [] array = OrdenacionBiDimensional.transformarMatrizEnArray(matriz);
		String salidaArray = OrdenacionBiDimensional.muestraArray(array);
		String salidaEsperadaArray = "Array: [35	7	20	3	12	91	69	26	17	28	43	5	83	67	16	77	33	10	37	8	1	13	27	36	48	54	9	4	25	6	11	70	81	95	50	2	88	14	15	21	19	29]";
		assertEquals(salidaArray, salidaEsperadaArray);

		OrdenacionBiDimensional.insercion(array);
		salidaArray = OrdenacionBiDimensional.muestraArray(array);
		salidaEsperadaArray = "Array: [1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	19	20	21	25	26	27	28	29	33	35	36	37	43	48	50	54	67	69	70	77	81	83	88	91	95]";
		assertEquals(salidaArray, salidaEsperadaArray);

		int [][] matrizFilas = OrdenacionBiDimensional.transformarArrayOrdenadoEnMatrizFilas(matriz, array);
		salidaMatriz = OrdenacionBiDimensional.muestraMatriz(matrizFilas);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "1	2	3	4	5	6	7" + "\n"
				+ "8	9	10	11	12	13	14" + "\n"
				+ "15	16	17	19	20	21	25" + "\n"
				+ "26	27	28	29	33	35	36" + "\n"
				+ "37	43	48	50	54	67	69" + "\n"
				+ "70	77	81	83	88	91	95";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		int [][] matrizColumnas = OrdenacionBiDimensional.transformarArrayOrdenadoEnMatrizColumnas(matriz, array);
		salidaMatriz = OrdenacionBiDimensional.muestraMatriz(matrizColumnas);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "1	8	15	26	37	70" + "\n"
				+ "2	9	16	27	43	77" + "\n"
				+ "3	10	17	28	48	81" + "\n"
				+ "4	11	19	29	50	83" + "\n"
				+ "5	12	20	33	54	88" + "\n"
				+ "6	13	21	35	67	91" + "\n"
				+ "7	14	25	36	69	95";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		int [][] matrizOrdenadaFilas = OrdenacionBiDimensional.matrizOrdenadaPorFilas(matriz);
		salidaMatriz = OrdenacionBiDimensional.muestraMatriz(matrizOrdenadaFilas);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "3	7	12	20	35	69	91" + "\n"
				+ "5	17	26	28	43	67	83" + "\n"
				+ "1	8	10	16	33	37	77" + "\n"
				+ "4	9	13	27	36	48	54" + "\n"
				+ "6	11	25	50	70	81	95" + "\n"
				+ "2	14	15	19	21	29	88";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		int [][] matrizOrdenadaColumnas = OrdenacionBiDimensional.matrizOrdenadaPorColumnas(matriz);
		salidaMatriz = OrdenacionBiDimensional.muestraMatriz(matrizOrdenadaColumnas);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "2	6	11	3	5	8	1" + "\n"
				+ "13	7	14	10	12	9	4" + "\n"
				+ "16	17	20	15	21	19	29" + "\n"
				+ "25	27	28	43	37	83	50" + "\n"
				+ "26	77	33	48	54	91	67" + "\n"
				+ "35	88	36	70	81	95	69";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

	}
}