package org.ip.sesion10;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class BusquedaArrayTestJUnit4 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBusquedaArray() {
		int [] arrayEnteros = {7, 12, 32, 22, 31, 24, 14, 1, 5, 34};
		int [] otroArrayEnteros = {1, 5, 11, 26, 49, 22, 1, 46, 17, 2};
		
		String salidaArray = Arrays.toString(arrayEnteros);
		String salidaEsperadaArray = "[7, 12, 32, 22, 31, 24, 14, 1, 5, 34]";
		assertEquals(salidaArray, salidaEsperadaArray);
		
		int posicion = BusquedaArray.busquedaSecuencial(arrayEnteros, 22);
		assertTrue(posicion == 3);
		
		posicion = BusquedaArray.busquedaSecuencial(arrayEnteros, 21);
		assertTrue(posicion == -1);
		
		posicion = BusquedaArray.busquedaSecuencial(arrayEnteros, 31);
		assertTrue(posicion == 4);
		
		Arrays.sort(arrayEnteros);
		salidaArray = Arrays.toString(arrayEnteros);
		salidaEsperadaArray = "[1, 5, 7, 12, 14, 22, 24, 31, 32, 34]";
		assertEquals(salidaArray, salidaEsperadaArray);

		posicion = BusquedaArray.busquedaBinaria(arrayEnteros, 31);
		assertTrue(posicion == 7);

		salidaArray = Arrays.toString(otroArrayEnteros);
		salidaEsperadaArray = "[1, 5, 11, 26, 49, 22, 1, 46, 17, 2]";
		assertEquals(salidaArray, salidaEsperadaArray);

		posicion = BusquedaArray.busquedaSecuencial(otroArrayEnteros, 29);
		assertTrue(posicion == -1);

		Arrays.sort(otroArrayEnteros);
		salidaArray = Arrays.toString(otroArrayEnteros);
		salidaEsperadaArray = "[1, 1, 2, 5, 11, 17, 22, 26, 46, 49]";
		assertEquals(salidaArray, salidaEsperadaArray);

		posicion = BusquedaArray.busquedaBinaria(otroArrayEnteros, 19);
		assertTrue(posicion == -1);

		posicion = BusquedaArray.busquedaBinaria(otroArrayEnteros, 1);
		assertTrue(posicion == 1);

		posicion = BusquedaArray.busquedaSecuencial(otroArrayEnteros, 1);
		assertTrue(posicion == 0);
	}
}