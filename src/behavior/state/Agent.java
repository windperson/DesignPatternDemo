package behavior.state;

public class Agent {
	
	public static final int HEALTH_LOW_LIMIT = 70;
	public static final int INJURED_LOW_LIMIT = 1;
	public static final int DEAD_LOW_LIMIT = 0;
	
	public static final int MAX_HP = 100;
	
	private int _HP = 0;
	private IAgentState _currentState = null;
	
	
	public Agent(int HP, IAgentState state)
	{
		_HP = HP;
		_currentState = state;
	}
	
	
	////
	public void search()
	{
		_currentState.search(this);
	}
	
	public void fight()
	{
		_currentState.fight(this);
	}
	
	public void hit(int aValue)
	{
		subHP(aValue);
		_currentState.hit(this);
	}
	
	public void heal(int aValue)
	{
		addHP(aValue);
		_currentState.heal(this);
	}
	
	
	////
	public int getHP()
	{
		return _HP;
	}
	
	public IAgentState getState()
	{
		return _currentState;
	}
	
	public void changeState(IAgentState state)
	{
		_currentState = state;
	}
	
	
	////
	private void addHP(int aValue)
	{
		_HP = _HP + aValue;
		if(_HP > MAX_HP)
		{
			_HP = MAX_HP;
		}
	}
	
	private void subHP(int aValue)
	{
		_HP = _HP - aValue;
		if(_HP < DEAD_LOW_LIMIT)
		{
			_HP = DEAD_LOW_LIMIT;
		}
	}
	

}
