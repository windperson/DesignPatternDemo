package structure.memento;

import static org.junit.Assert.*;

import org.junit.Test;

import structure.memento.*;

public class TestMemento {

	@Test
	public void test() {
		Caretaker caretaker = new Caretaker();
		Player player = new Player();
		System.out.println("\n Init player");
		player.displayState();
		
		System.out.println("save backup first...");
		caretaker.saveState(player.createMemento());
		player.displayState();
		
		System.out.println("fight()");
		player.fight();
		player.displayState();
		
		System.out.println("\n load saved backup.");
		player.setMemento(caretaker.getState(0));
		player.displayState();
		
	    
		
	}

}
