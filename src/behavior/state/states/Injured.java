package behavior.state.states;

import behavior.state.Agent;
import behavior.state.IAgentState;

public class Injured implements IAgentState {

	@Override
	public void hit(Agent agent) {
		decideState(agent);
	}

	@Override
	public void heal(Agent agent) {
		decideState(agent);
	}

	@Override
	public void fight(Agent agent) {
		// do what ever they want.
	}

	@Override
	public void search(Agent agent) {
		// do what ever they want.

	}
	
	private void decideState(Agent agent)
	{
		int hp = agent.getHP();
		if( hp >= Agent.INJURED_LOW_LIMIT)
		{
			//System.out.println("hit");
			agent.changeState(new HealthState());
		}
		if( hp < Agent.INJURED_LOW_LIMIT && hp > Agent.DEAD_LOW_LIMIT)
		{
			//do nothing.
		}
		else if( hp <= Agent.DEAD_LOW_LIMIT)
		{
			agent.changeState(new DeadState());
		}
	}

}
