package clases;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pruebas {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Coche c1 = new Coche ();
		//assertEquals(99, c1.acelerar(99));
		
		assertTrue(c1.multa());
	}
	
	@Test
	public void test2()
	{
		int numeros1[] = {1,2,3};
		int numeros2[] = {1,2,5};
		
		assertArrayEquals(numeros1, numeros2);
	}

}
