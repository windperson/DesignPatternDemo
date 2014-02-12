package creation.builder.test;

import static org.junit.Assert.*;

import org.junit.Test;

import creation.builder.IConfigPropertyBuilder;
import creation.builder.ConfigurationError;
import creation.builder.PlainTxtConfigPropertyBuilder;

public class BuilderTest {

	@Test
	public void testHowToUseTxtConfigBuilder() throws ConfigurationError {
		
		String configStr = PlainTxtConfigPropertyBuilder.GetBuilder()
										 				.timeout(30)
										 				.platform("Ubuntu")
										 				.location("\\opt\\property.txt")
										 				.builder();
		
		assertEquals("TIMEOUT=30\nPLATFORM=Ubuntu\nLOCATION=\\opt\\property.txt\n",configStr);
		
	}

}
