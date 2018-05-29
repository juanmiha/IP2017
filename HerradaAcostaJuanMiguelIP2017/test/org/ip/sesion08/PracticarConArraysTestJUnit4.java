package org.ip.sesion08;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PracticarConArraysTestJUnit4 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPracticarConArrays() {
		int [] arrayEnteros = {5, 10, 15, 2, 4, 23, 7, 13, 8, 17, 27};

		String salidaArrayEnteros = PracticarConArrays.mostrarArray(arrayEnteros);
		assertEquals(salidaArrayEnteros, "Array de Enteros: 5	10	15	2	4	23	7	13	8	17	27");

		int indiceMenorValor, indiceMayorValor;
		indiceMenorValor = PracticarConArrays.indiceMinimoValor(arrayEnteros);
		indiceMayorValor = PracticarConArrays.indiceMaximoValor(arrayEnteros);
		assertTrue(indiceMenorValor == 3);
		assertTrue(indiceMayorValor == 10);

		int [] resultado = PracticarConArrays.invertir(arrayEnteros);
		salidaArrayEnteros = PracticarConArrays.mostrarArray(resultado);
		assertEquals(salidaArrayEnteros, "Array de Enteros: 27	17	8	13	7	23	4	2	15	10	5");

		indiceMenorValor = PracticarConArrays.indiceMinimoValor(resultado);
		indiceMayorValor = PracticarConArrays.indiceMaximoValor(resultado);
		assertTrue(indiceMenorValor == 7);
		assertTrue(indiceMayorValor == 0);

		PracticarConArrays.desplazar(arrayEnteros);

		salidaArrayEnteros = PracticarConArrays.mostrarArray(arrayEnteros);
		assertEquals(salidaArrayEnteros, "Array de Enteros: 10	15	2	4	23	7	13	8	17	27	5");

		for (int i = 0; i < 5; i++)
			PracticarConArrays.desplazar(arrayEnteros);

		salidaArrayEnteros = PracticarConArrays.mostrarArray(arrayEnteros);
		assertEquals(salidaArrayEnteros, "Array de Enteros: 7	13	8	17	27	5	10	15	2	4	23");

		int [] otroArrayEnteros = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2, 1, 2, 4, 7, 5};

		salidaArrayEnteros = PracticarConArrays.mostrarArray(otroArrayEnteros);
		assertEquals(salidaArrayEnteros, "Array de Enteros: 1	2	3	2	1	6	3	4	5	2	1	2	4	7	5");

	}
}