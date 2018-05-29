package org.ip.sesion08;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class EstadisticasArraysCompletaTestJUnit4 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEstadisticasArray() {
		int [] arrayEnteros = {5, 10, 15};
		int [] otroArrayEnteros = {2, 15, 6, 5, 4, 3, 23, 43, 12, 7};
		double [] arrayReales = {5.0, 25.5, 15.75, 10.25};
		double [] otroArrayReales = {5.6, 4.5, 3.3, 13.2, 4.0, 34.33, 45.45, 34.0, 1123.75, 27.38, 99.77, 17.65};
		
		String salidaArrayEnteros = EstadisticasArrays.mostrarArray(arrayEnteros);
		assertEquals(salidaArrayEnteros, "Array de Enteros: 5	10	15");

		salidaArrayEnteros = EstadisticasArrays.mostrarArray(otroArrayEnteros);
		assertEquals(salidaArrayEnteros, "Array de Enteros: 2	15	6	5	4	3	23	43	12	7");

		String salidaArrayReales = EstadisticasArrays.mostrarArray(arrayReales);
		assertEquals(salidaArrayReales, "Array de Reales: 5.0	25.5	15.75	10.25");

		salidaArrayReales = EstadisticasArrays.mostrarArray(otroArrayReales);
		assertEquals(salidaArrayReales, "Array de Reales: 5.6	4.5	3.3	13.2	4.0	34.33	45.45	34.0	1123.75	27.38	99.77	17.65");

		int minimoArrayEnteros = EstadisticasArrays.min(arrayEnteros);
		int maximoArrayEnteros = EstadisticasArrays.max(arrayEnteros);
		double mediaArrayEnteros = EstadisticasArrays.media(arrayEnteros);
		double varianzaArrayEnteros = EstadisticasArrays.var(arrayEnteros);
		double desviacionArrayEnteros = EstadisticasArrays.stdDev(arrayEnteros);
		assertTrue(minimoArrayEnteros == 5);
		assertTrue(maximoArrayEnteros == 15);
		assertTrue(mediaArrayEnteros == 10.0);
		assertTrue(varianzaArrayEnteros == 25.0);
		assertTrue(desviacionArrayEnteros == 5.0);

		minimoArrayEnteros = EstadisticasArrays.min(otroArrayEnteros, 2, 8);
		maximoArrayEnteros = EstadisticasArrays.max(otroArrayEnteros, 8, 9);
		mediaArrayEnteros = EstadisticasArrays.media(otroArrayEnteros, 1, 7);
		varianzaArrayEnteros = EstadisticasArrays.var(otroArrayEnteros, 2, 7);
		desviacionArrayEnteros = EstadisticasArrays.stdDev(otroArrayEnteros, 4, 7);
		assertTrue(minimoArrayEnteros == 3);
		assertTrue(maximoArrayEnteros == 12);
		assertTrue(mediaArrayEnteros == 14.142857142857142);
		assertTrue(varianzaArrayEnteros == 257.6);
		assertTrue(desviacionArrayEnteros == 18.89223826513594);
		
		double minimoArrayReales = EstadisticasArrays.min(arrayReales, 1, 2);
		double maximoArrayReales = EstadisticasArrays.max(arrayReales, 1, 2);
		double mediaArrayReales = EstadisticasArrays.media(arrayReales, 1, 2);
		double varianzaArrayReales = EstadisticasArrays.var(arrayReales, 1, 2);
		double desviacionArrayReales = EstadisticasArrays.stdDev(arrayReales, 1, 2);
		assertTrue(minimoArrayReales == 15.75);
		assertTrue(maximoArrayReales == 25.50);
		assertTrue(mediaArrayReales == 20.625);
		assertTrue(varianzaArrayReales == 47.53125);
		assertTrue(desviacionArrayReales == 6.894291116568838);

		minimoArrayReales = EstadisticasArrays.min(otroArrayReales, 3, 10);
		maximoArrayReales = EstadisticasArrays.max(otroArrayReales, 0, 7);
		mediaArrayReales = EstadisticasArrays.media(otroArrayReales, 2, 9);
		varianzaArrayReales = EstadisticasArrays.var(otroArrayReales, 4, 8);
		desviacionArrayReales = EstadisticasArrays.stdDev(otroArrayReales, 1, 5);
		assertTrue(minimoArrayReales == 4.0);
		assertTrue(maximoArrayReales == 45.45);
		assertTrue(mediaArrayReales == 160.67625);
		assertTrue(varianzaArrayReales == 239737.74143);
		assertTrue(desviacionArrayReales == 13.190139498883246);
		
		minimoArrayReales = EstadisticasArrays.min(otroArrayReales);
		maximoArrayReales = EstadisticasArrays.max(otroArrayReales);
		mediaArrayReales = EstadisticasArrays.media(otroArrayReales);
		varianzaArrayReales = EstadisticasArrays.var(otroArrayReales);
		desviacionArrayReales = EstadisticasArrays.stdDev(otroArrayReales);
		assertTrue(minimoArrayReales == 3.3);
		assertTrue(maximoArrayReales == 1123.75);
		assertTrue(mediaArrayReales == 117.74416666666669);
		assertTrue(varianzaArrayReales == 101101.63893560605);
		assertTrue(desviacionArrayReales == 317.9648391498753);

		Arrays.sort(arrayReales);
		salidaArrayReales = EstadisticasArrays.mostrarArray(arrayReales);
		assertEquals(salidaArrayReales, "Array de Reales: 5.0	10.25	15.75	25.5");
		salidaArrayReales = Arrays.toString(arrayReales);
		assertEquals(salidaArrayReales, "[5.0, 10.25, 15.75, 25.5]");
		Arrays.sort(otroArrayReales);
		salidaArrayReales = Arrays.toString(otroArrayReales);
		assertEquals(salidaArrayReales, "[3.3, 4.0, 4.5, 5.6, 13.2, 17.65, 27.38, 34.0, 34.33, 45.45, 99.77, 1123.75]");
		int pos = Arrays.binarySearch(otroArrayReales, 15.5);
		assertTrue(pos == -6);
		pos = Arrays.binarySearch(otroArrayReales, 27.38);
		assertTrue(pos == 6);

	}
}
