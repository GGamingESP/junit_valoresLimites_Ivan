package junit_valoresLimites_Ivan;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mayoresedadtest {
	
	@Test()
	public void test1 () {
		
		assertThrows(AssertionError.class, () -> {
			mayoresedad p = new mayoresedad(-1);
			p.isMayorEdad();
		});
	}
	
	@Test public void test2 () {
		assertThrows(AssertionError.class, () -> {
			mayoresedad p = new mayoresedad(-100);
			p.isMayorEdad();
		});
	}
	
	@Test public void test3 () {
		mayoresedad p = new mayoresedad(0);
		assertFalse(p.isMayorEdad());
	}
	
	@Test public void test4 () {
		mayoresedad p = new mayoresedad(17);
		assertFalse(p.isMayorEdad());
	}
	
	@Test public void test5 () {
		mayoresedad p = new mayoresedad(18);
		assertTrue(p.isMayorEdad());
	}
	
	@Test public void test6 () {
		mayoresedad p = new mayoresedad(100);
		assertTrue(p.isMayorEdad());
	}
			
}
