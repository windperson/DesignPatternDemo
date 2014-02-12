package behavior.strategy;

public class Player {
	
	IBatStrategy _strategy = null;
	
	public Player(IBatStrategy strategy)
	{
		_strategy = strategy;
	}
	
	public void bat()
	{
		_strategy.swing();
	}

}
