package behavior.state.states;

import behavior.state.Agent;
import behavior.state.IAgentState;

public class DeadState implements IAgentState {

	@Override
	public void hit(Agent agent) {
		// hit a dead man is still a dead man.
	}

	@Override
	public void heal(Agent agent) {
		// sorry, no resurrection.
	}

	@Override
	public void fight(Agent agent) {
		// do what ever they want.
	}

	@Override
	public void search(Agent agent) {
		// do what ever they want.

	}

	
	
}
