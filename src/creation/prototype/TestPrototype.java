package creation.prototype;

import java.util.Date;

import org.junit.Test;

public class TestPrototype {
	
	private static final int MAX =50;

	@Test
	public void test() {
		
		Date start = new Date();
		Monster origin = new Monster(100,100, "\\fake\fakeMonsterModel.xml");
		
		for(int i=0;i< MAX - 1; i++){
			@SuppressWarnings("unused")
			Monster clone = origin.clone();
		}
		Date end = new Date();
		
		System.out.println("test() cost = " + (end.getTime() - start.getTime()) + " ms");
	}
	
	@Test
	public void testUseCtor(){
		
		Date start = new Date();
		
		for(int i=0;i< MAX; i++){
			@SuppressWarnings("unused")
			Monster origin = new Monster(100,100, "\\fake\fakeMonsterModel.xml");
		}
		Date end = new Date();
		
		System.out.println("testUseCtor() cost = " + (end.getTime() - start.getTime()) + " ms");
	}

}
