package structure.flyweight;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestFlyweight {

	@Test
	public void test() {
		int max = 100;
		List<Monster> monsters = new LinkedList<>();
		
		for(int i=0;i<max;i++){
			monsters.add(new Monster("A", 50, 80, "\\fake\fakeModelA.xml"));
		}
		
		for(int i=0;i<max;i++){
			monsters.add(new Monster("B", 40, 70,"\\fake\fakeModelB.xml"));
		}
		
		assertEquals(200, monsters.size());
		assertEquals(2, ExteriorFactory.getInstance().getFlyweightSize());
	}

}
