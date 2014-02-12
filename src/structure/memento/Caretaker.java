package structure.memento;

import java.util.LinkedList;
import java.util.List;

public class Caretaker {
	private List<Player.Memento> savedStates;

	public Caretaker(){
		savedStates = new LinkedList<Player.Memento>();
	}
	
	public void saveState(Player.Memento aMemento){
		savedStates.add(aMemento);
	}
	
	public Player.Memento getState(int aIndex){
		if(aIndex > savedStates.size())
			throw new RuntimeException("Invalid state index.");
		
		return savedStates.get(aIndex);
	}
	
}
