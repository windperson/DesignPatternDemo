package creation.singleton.test;

import creation.singleton.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SingletonTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Singleton s1 = Singleton.getInstance();
		assertNotNull(s1);
		
		Singleton s2 = Singleton.getInstance();
		assertNotNull(s2);
		
		assertEquals(s1, s2);
	}

}
