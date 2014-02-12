package structure.proxy;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestProxy {

	@Test
	public void testNotUsingProxy() {
		IUIDescriManager manager = new UIDescriptionManagerImpl();
		System.out.println("use real object");
		try {
			manager.getDescription("test");
			manager.getDescription("test");
			manager.getDescription("test");
			
		} catch (DescriptionNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testUsingProxy(){
		IUIDescriManager manager = new UIDescriptionManagerProxy(new UIDescriptionManagerImpl());
		System.out.println("use proxy");
		
		try {
			manager.getDescription("test");
			manager.getDescription("test");
			manager.getDescription("test");
			
		} catch (DescriptionNotFoundException e) {
			e.printStackTrace();
		}
	}

}
