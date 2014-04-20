package creation.prototype;

import java.util.Date;

import org.junit.Test;

public class TestPrototype {

	@Test
	public void test() {
		int max = 50;
		Date start = new Date();
		Monster origin = new Monster(100,100, "\\fake\fakeMonsterModel.xml");
		
		for(int i=0;i< max - 1; i++){
			Monster clone = origin.clone();
		}
		Date end = new Date();
		
		System.out.println("test() cost = " + (end.getTime() - start.getTime()) + " ms");
	}
	
	@Test
	public void testUseCtor(){
		int max = 50;
		Date start = new Date();
		
		for(int i=0;i< max; i++){
			Monster origin = new Monster(100,100, "\\fake\fakeMonsterModel.xml");
		}
		Date end = new Date();
		
		System.out.println("testUseCtor() cost = " + (end.getTime() - start.getTime()) + " ms");
	}

}
