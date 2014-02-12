package behavior.strategy.strategies;

import behavior.strategy.IBatStrategy;

public class HomeRunStrategy implements IBatStrategy {

	public HomeRunStrategy()
	{
		
	}
	
	@Override
	public void swing() {
		System.out.println("HomeRun");
	}
	

}
