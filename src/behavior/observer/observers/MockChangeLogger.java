package behavior.observer.observers;

import java.util.Date;

import behavior.observer.IObserver;
import behavior.observer.ISubject;
import behavior.observer.State;
import behavior.observer.Subject;

public class MockChangeLogger implements IObserver {
	
	private int _logCount;

	@Override
	public void update(ISubject obj) {
		Subject subject = (Subject)obj;
		writeChangeLog(subject.getState(), new Date());
	}
	
	public int getLogCount()
	{
		return _logCount;
	}
	
	private void writeChangeLog(State state, Date logDate)
	{
		_logCount++;
	}
	
	

}
