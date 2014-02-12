package behavior.strategy.test;

import behavior.strategy.Player;
import behavior.strategy.strategies.*;

public class Test {

	@org.junit.Test
	public void test() {
		Player player = new Player(new BuntStrategy());
		player.bat();
		
		player = new Player(new FreeBatStrategy());
		player.bat();
		
		player = new Player(new HomeRunStrategy());
		player.bat();
		
	}

}
