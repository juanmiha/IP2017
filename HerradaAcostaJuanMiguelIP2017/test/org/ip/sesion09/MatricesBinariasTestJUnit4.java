package org.ip.sesion09;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatricesBinariasTestJUnit4 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMatricesBinarias() {
		int [][] matrizBinariaA = {{1, 0, 1, 0, 1}, {1, 1, 1, 0, 1},
				{1, 0, 1, 1, 1}, {1, 0, 1, 1, 1}, {1, 0, 1, 1, 1}};
		int [][] matrizBinariaB = {{1, 0, 1, 0, 1}, {1, 1, 1, 0, 1},
				{1, 0, 1, 1, 10}, {0, 0, 1, 1, 1}, {1, 1, 1, 1, 1}};
		int [][] matrizBinariaC = {{0, 0, 1, 0, 0}, {0, 0, 0, 0, 0},
				{1, 0, 1, 0, 1}, {0, 0, 0, 0, 1}, {0, 0, 0, 0, 0}};

		boolean esBinaria = MatricesBinarias.esBinaria(matrizBinariaA);
		assertTrue(esBinaria);

		String salidaMatrizBinaria = MatricesBinarias.muestraMatriz(matrizBinariaA);
		String salidaEsperadaMatrizBinaria = "Matriz Binaria:" + "\n"
				+ "1	0	1	0	1" + "\n"
				+ "1	1	1	0	1" + "\n"
				+ "1	0	1	1	1" + "\n"
				+ "1	0	1	1	1" + "\n"
				+ "1	0	1	1	1";
		assertEquals(salidaMatrizBinaria, salidaEsperadaMatrizBinaria);

		esBinaria = MatricesBinarias.esBinaria(matrizBinariaB);
		assertFalse(esBinaria);

		matrizBinariaB = MatricesBinarias.transformaBinaria(matrizBinariaB);

		salidaMatrizBinaria = MatricesBinarias.muestraMatriz(matrizBinariaB);
		salidaEsperadaMatrizBinaria = "Matriz Binaria:" + "\n"
				+ "1	0	1	0	1" + "\n"
				+ "1	1	1	0	1" + "\n"
				+ "1	0	1	1	0" + "\n"
				+ "0	0	1	1	1" + "\n"
				+ "1	1	1	1	1";
		assertEquals(salidaMatrizBinaria, salidaEsperadaMatrizBinaria);

		esBinaria = MatricesBinarias.esBinaria(matrizBinariaB);
		assertTrue(esBinaria);

		int [] mayorNumeroUnos = MatricesBinarias.mayorNumeroDeUnos(matrizBinariaA);
		assertTrue(mayorNumeroUnos[0] == 1); assertTrue(mayorNumeroUnos[1] == 0);

		mayorNumeroUnos = MatricesBinarias.mayorNumeroDeUnos(matrizBinariaB);
		assertTrue(mayorNumeroUnos[0] == 4); assertTrue(mayorNumeroUnos[1] == 2);

		salidaMatrizBinaria = MatricesBinarias.muestraMatriz(matrizBinariaC);
		salidaEsperadaMatrizBinaria = "Matriz Binaria:" + "\n"
				+ "0	0	1	0	0" + "\n"
				+ "0	0	0	0	0" + "\n"
				+ "1	0	1	0	1" + "\n"
				+ "0	0	0	0	1" + "\n"
				+ "0	0	0	0	0";
		assertEquals(salidaMatrizBinaria, salidaEsperadaMatrizBinaria);

		esBinaria = MatricesBinarias.esBinaria(matrizBinariaC);
		assertTrue(esBinaria);

		int [] numeroFilasColumnasMismoValor = MatricesBinarias.numeroFilasColumnasMismoValor(matrizBinariaA);
		assertTrue(numeroFilasColumnasMismoValor[0] == 0); assertTrue(numeroFilasColumnasMismoValor[1] == 0);
		assertTrue(numeroFilasColumnasMismoValor[2] == 0); assertTrue(numeroFilasColumnasMismoValor[3] == 3);

		numeroFilasColumnasMismoValor = MatricesBinarias.numeroFilasColumnasMismoValor(matrizBinariaB);
		assertTrue(numeroFilasColumnasMismoValor[0] == 0); assertTrue(numeroFilasColumnasMismoValor[1] == 1);
		assertTrue(numeroFilasColumnasMismoValor[2] == 0); assertTrue(numeroFilasColumnasMismoValor[3] == 1);

		numeroFilasColumnasMismoValor = MatricesBinarias.numeroFilasColumnasMismoValor(matrizBinariaC);
		assertTrue(numeroFilasColumnasMismoValor[0] == 2); assertTrue(numeroFilasColumnasMismoValor[1] == 0);
		assertTrue(numeroFilasColumnasMismoValor[2] == 2); assertTrue(numeroFilasColumnasMismoValor[3] == 0);

		boolean numeroImparUnos = MatricesBinarias.numeroImparUnos(matrizBinariaA);
		assertTrue(numeroImparUnos);

		boolean numeroParCeros = MatricesBinarias.numeroParCeros(matrizBinariaA);
		assertTrue(numeroParCeros);
		assertTrue(numeroImparUnos && numeroParCeros);

		numeroImparUnos = MatricesBinarias.numeroImparUnos(matrizBinariaB);
		assertFalse(numeroImparUnos);

		numeroParCeros = MatricesBinarias.numeroParCeros(matrizBinariaB);
		assertFalse(numeroParCeros);
		assertTrue(!numeroImparUnos && !numeroParCeros);

		numeroImparUnos = MatricesBinarias.numeroImparUnos(matrizBinariaC);
		assertTrue(numeroImparUnos);

		numeroParCeros = MatricesBinarias.numeroParCeros(matrizBinariaC);
		assertTrue(numeroParCeros);
		assertTrue(numeroImparUnos && numeroParCeros);

		int [] sumaFilas = MatricesBinarias.sumaFilas(matrizBinariaA);
		String salidaArray = MatricesBinarias.muestraArray(sumaFilas);
		String salidaEsperadaArray = "Array: [3	4	4	4	4]";
		assertEquals(salidaArray, salidaEsperadaArray);

		int [] sumaColumnas = MatricesBinarias.sumaColumnas(matrizBinariaA);
		salidaArray = MatricesBinarias.muestraArray(sumaColumnas);
		salidaEsperadaArray = "Array: [5	1	5	3	5]";
		assertEquals(salidaArray, salidaEsperadaArray);

		sumaFilas = MatricesBinarias.sumaFilas(matrizBinariaB);
		salidaArray = MatricesBinarias.muestraArray(sumaFilas);
		salidaEsperadaArray = "Array: [3	4	3	3	5]";
		assertEquals(salidaArray, salidaEsperadaArray);

		sumaColumnas = MatricesBinarias.sumaColumnas(matrizBinariaB);
		salidaArray = MatricesBinarias.muestraArray(sumaColumnas);
		salidaEsperadaArray = "Array: [4	2	5	3	4]";
		assertEquals(salidaArray, salidaEsperadaArray);

		sumaFilas = MatricesBinarias.sumaFilas(matrizBinariaC);
		salidaArray = MatricesBinarias.muestraArray(sumaFilas);
		salidaEsperadaArray = "Array: [1	0	3	1	0]";
		assertEquals(salidaArray, salidaEsperadaArray);

		sumaColumnas = MatricesBinarias.sumaColumnas(matrizBinariaC);
		salidaArray = MatricesBinarias.muestraArray(sumaColumnas);
		salidaEsperadaArray = "Array: [1	0	2	0	2]";
		assertEquals(salidaArray, salidaEsperadaArray);

		int [] valoresFilasDecimal = MatricesBinarias.valoresFilasDecimal(matrizBinariaA);
		salidaArray = MatricesBinarias.muestraArray(valoresFilasDecimal);
		salidaEsperadaArray = "Array: [21	29	23	23	23]";
		assertEquals(salidaArray, salidaEsperadaArray);

		valoresFilasDecimal = MatricesBinarias.valoresFilasDecimal(matrizBinariaB);
		salidaArray = MatricesBinarias.muestraArray(valoresFilasDecimal);
		salidaEsperadaArray = "Array: [21	29	22	7	31]";
		assertEquals(salidaArray, salidaEsperadaArray);

		valoresFilasDecimal = MatricesBinarias.valoresFilasDecimal(matrizBinariaC);
		salidaArray = MatricesBinarias.muestraArray(valoresFilasDecimal);
		salidaEsperadaArray = "Array: [4	0	21	1	0]";
		assertEquals(salidaArray, salidaEsperadaArray);

		int [] valoresColumnasDecimal = MatricesBinarias.valoresColumnasDecimal(matrizBinariaA);
		salidaArray = MatricesBinarias.muestraArray(valoresColumnasDecimal);
		salidaEsperadaArray = "Array: [31	8	31	7	31]";
		assertEquals(salidaArray, salidaEsperadaArray);

		valoresColumnasDecimal = MatricesBinarias.valoresColumnasDecimal(matrizBinariaB);
		salidaArray = MatricesBinarias.muestraArray(valoresColumnasDecimal);
		salidaEsperadaArray = "Array: [29	9	31	7	27]";
		assertEquals(salidaArray, salidaEsperadaArray);

		valoresColumnasDecimal = MatricesBinarias.valoresColumnasDecimal(matrizBinariaC);
		salidaArray = MatricesBinarias.muestraArray(valoresColumnasDecimal);
		salidaEsperadaArray = "Array: [4	0	20	0	6]";
		assertEquals(salidaArray, salidaEsperadaArray);
	}
}