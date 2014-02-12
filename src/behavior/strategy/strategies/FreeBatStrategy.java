package behavior.strategy.strategies;

import behavior.strategy.IBatStrategy;

public class FreeBatStrategy implements IBatStrategy {

	public FreeBatStrategy()
	{
		
	}
	
	@Override
	public void swing() {
		System.out.println("FreeBat");
	}
	

}
