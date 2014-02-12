package behavior.observer;

public interface ISubject {

	void addObserver(IObserver obj);
	void remoeObserver(IObserver obj);
	
	void notifyObservers();
}
