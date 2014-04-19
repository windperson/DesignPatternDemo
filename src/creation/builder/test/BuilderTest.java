package creation.builder.test;

import static org.junit.Assert.*;

import org.junit.Test;

import creation.builder.ConfigurationError;
import creation.builder.JsonConfigPropertyBuilder;
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
	
	@Test
	public void testHowToUseJsonConfigBuilder() throws ConfigurationError {
		
		String configStr = JsonConfigPropertyBuilder.GetBuilder()
													.timeout(30)
													.platform("Ubuntu")
													.location("\\temp\\prop.json")
													.builder();
		
		assertEquals("{'TIMEOUT':30,'PLATFORM':'Ubuntu','LOCATION':'\\temp\\prop.json'}", configStr);
				
	}

}
