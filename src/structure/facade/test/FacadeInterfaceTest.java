package structure.facade.test;

import structure.facade.FacadeInterface;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FacadeInterfaceTest {
	
	private FacadeInterface apiInstance;

	@Before
	public void setUp() throws Exception {
		apiInstance = new FacadeInterface();
	}

	@Test
	public void testAPI1Method1() {
		assertEquals(1, apiInstance.API1Method1());
	}

	@Test
	public void testAPI1Method2() {
		assertEquals(2.5, apiInstance.API1Method2(), 0.0);
	}

	@Test
	public void testAPIMethod3() {
		assertEquals("oldAPI2", apiInstance.APIMethod3());
	}

	@Test
	public void testAPIMethod4() {
		assertEquals("oldAPI22", apiInstance.APIMethod4());
	}

}
