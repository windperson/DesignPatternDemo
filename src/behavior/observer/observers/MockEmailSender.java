package behavior.observer.observers;

import behavior.observer.*;

import behavior.observer.IObserver;
import behavior.observer.ISubject;

public class MockEmailSender implements IObserver {
	
	private int _sendCount;

	@Override
	public void update(ISubject obj) {
		State newState = ((Subject)obj).getState();
		sendMockEmail(newState);

	}
	
	public int getSendCount()
	{
		return _sendCount;
	}
	
	private void sendMockEmail(State aState)
	{
		_sendCount++;
	}

}
