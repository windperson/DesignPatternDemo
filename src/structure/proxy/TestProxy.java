package structure.proxy;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class TestProxy {

	@Test
	public void testNotUsingProxy() {
		
		Date start = new Date();
		IUIDescriManager manager = new UIDescriptionManagerImpl();
		System.out.println("use real object");
		try {
			manager.getDescription("test");
			manager.getDescription("test");
			manager.getDescription("test");
			
			Date end = new Date();
			long runTime = end.getTime() - start.getTime();
			System.out.println("runTime=" + runTime);
			assertTrue(6000 <= runTime);
		} catch (DescriptionNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testUsingProxy(){
		
		Date start = new Date();
		
		IUIDescriManager manager = new UIDescriptionManagerProxy(new UIDescriptionManagerImpl());
		System.out.println("use proxy");
		
		try {
			manager.getDescription("test");
			manager.getDescription("test");
			manager.getDescription("test");
			
			Date end = new Date();
			long runTime = end.getTime() - start.getTime();
			System.out.println("runTime=" + runTime);
			assertTrue(2000 <= runTime);
		} catch (DescriptionNotFoundException e) {
			e.printStackTrace();
		}
	}

}
