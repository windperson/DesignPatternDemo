package behavior.state;

public interface IAgentState {
	
	public void hit(Agent agent);
	public void heal(Agent agent);
	public void fight(Agent agent);
	public void search(Agent agent);

}
