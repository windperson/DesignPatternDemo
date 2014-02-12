package behavior.state.test;

import behavior.state.*;
import behavior.state.states.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class StateTest {

	@Test
	public void test() {
		
		Agent agent = new Agent(Agent.MAX_HP, new HealthState());
		
		assertNotNull(agent.getState());
		assertEquals("Test default state", HealthState.class, agent.getState().getClass());
		
		agent.heal(80);
		assertEquals("Test health -> health", Agent.MAX_HP, agent.getHP());
		assertEquals(HealthState.class, agent.getState().getClass());
		
		agent.hit(30);
		assertEquals(HealthState.class, agent.getState().getClass());
		
		agent.hit(1);
		assertEquals("Test health -> injured", Injured.class, agent.getState().getClass());
		
		agent.heal(31);
		assertEquals(Agent.MAX_HP, agent.getHP());
		assertEquals("Test injured -> health", HealthState.class, agent.getState().getClass());
		
		agent.hit(100);
		assertEquals(0, agent.getHP());
		assertEquals("Test health -> dead", DeadState.class, agent.getState().getClass());
		
		
		
		
		
		
	}
	

}
