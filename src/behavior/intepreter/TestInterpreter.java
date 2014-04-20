package behavior.intepreter;

import java.io.FileNotFoundException;

import org.junit.Test;

import behavior.intepreter.grammmar.Script;

public class TestInterpreter {

	/*
	@Test
	public void test() throws FileNotFoundException {
		INode script = new Script();
		script.parse(new Context("d:\\temp\\simple.txt"));
		script.execute();
	}
	*/
	
	@Test
	public void testUseBlock() throws FileNotFoundException {
		INode script = new Script();
		script.parse(new Context("d:\\temp\\block.txt"));
		script.execute();
	}

}
