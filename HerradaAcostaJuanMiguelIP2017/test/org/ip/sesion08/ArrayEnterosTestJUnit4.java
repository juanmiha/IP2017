package org.ip.sesion08;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayEnterosTestJUnit4 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testArrayEnteros() {
		int[] arrayEnteros = {5, 10, -15, 2, -4, 23, 7, -13, 8, 17, 27};
		int[] otroArrayEnteros = {20, 6, -30, 8, 1, 30, -2};

		ArrayEnteros objetoArray1 = new ArrayEnteros(arrayEnteros);
		ArrayEnteros objetoArray2 = new ArrayEnteros(otroArrayEnteros);
		ArrayEnteros objetoArray3 = new ArrayEnteros(11);

		String salidaArray = objetoArray1.toString();
		String salidaEsperadaArray = "ArrayEnteros: "
				+ "[5	10	-15	2	-4	23	7	-13	8	17	27]";
		assertEquals(salidaArray, salidaEsperadaArray);

		salidaArray = objetoArray2.toString();
		salidaEsperadaArray = "ArrayEnteros: "
				+ "[20	6	-30	8	1	30	-2]";
		assertEquals(salidaArray, salidaEsperadaArray);

		salidaArray = objetoArray3.toString();
		salidaEsperadaArray = "ArrayEnteros: "
				+ "[0	1	2	3	4	5	6	7	8	9	10]";
		assertEquals(salidaArray, salidaEsperadaArray);

		assertTrue(objetoArray1.getNumeroElementos() == 11);
		assertTrue(objetoArray2.getValorElemento(2) == -30);
		assertTrue(objetoArray3.getValorElemento(7) == 7);
		assertTrue(objetoArray3.setValorElemento(7, 0));
		assertTrue(objetoArray3.getValorElemento(7) == 0);

		assertTrue(objetoArray1.getRangoValores() == 42);
		assertTrue(objetoArray2.getRangoValores() == 60);

		assertTrue(objetoArray3.setValorElemento(3, 0));
		assertTrue(objetoArray3.setValorElemento(9, 1));
		assertTrue(objetoArray3.setValorElemento(5, 1));
		assertTrue(objetoArray3.setValorElemento(10, 2));
		salidaArray = objetoArray3.toString();
		salidaEsperadaArray = "ArrayEnteros: "
				+ "[0	1	2	0	4	1	6	0	8	1	2]";
		assertEquals(salidaArray, salidaEsperadaArray);

		assertTrue(objetoArray1.equals(objetoArray2) == false);

		assertTrue(objetoArray2.compareTo(objetoArray1) == 1);
		assertTrue(objetoArray3.compareTo(objetoArray1) == -1);

		ArrayEnteros objetoArray4 = new ArrayEnteros(objetoArray2);
		assertTrue(objetoArray2.compareTo(objetoArray4) == 0);
		assertTrue(objetoArray4.equals(objetoArray2) == true);
	}
}