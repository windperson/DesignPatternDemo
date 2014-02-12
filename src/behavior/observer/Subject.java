package behavior.observer;

import java.util.List;
import java.util.LinkedList;

public class Subject implements ISubject {
	
	private List<IObserver> subscribers = new LinkedList<IObserver>();
	
	private State _state;

	@Override
	public void addObserver(IObserver obj) {
		subscribers.add(obj);
	}

	@Override
	public void remoeObserver(IObserver obj) {
		subscribers.remove(obj);
	}

	@Override
	public void notifyObservers() {
		for(IObserver obj : subscribers)
		{
			obj.update(this);
		}
	}

	
	public void changeState(State newState)
	{
		this.notifyObservers();
	}
	
	public State getState()
	{
		return _state;
	}
}
