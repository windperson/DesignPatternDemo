package structure.template.test;

import structure.template.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestParser {

	private AbstractConfigParser _fileParser, _dbParser;
	
	@Before
	public void setUp() throws Exception {
		_fileParser = new FileConfigParser("C:\\config.ini");
		_dbParser = new DBConfigParser("localhost");
		
	}

	@Test
	public void test() {
		PersonData pd = _fileParser.doParse();
		assertEquals("Teddy", pd.getName());
		assertEquals(100, pd.getHp());
		
		pd = _dbParser.doParse();
		assertEquals("Kay", pd.getName());
		assertEquals(50, pd.getHp());
	}

}
