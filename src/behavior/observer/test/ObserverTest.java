package behavior.observer.test;

import behavior.observer.*;
import behavior.observer.observers.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObserverTest {

	@Test
	public void test() {
		
		Subject subject = new Subject();
		
		MockChangeLogger logger = new MockChangeLogger();
		MockEmailSender emailer = new MockEmailSender();
		
		subject.addObserver(logger);
		subject.addObserver(emailer);
		assertEquals(0, logger.getLogCount());
		assertEquals(0, emailer.getSendCount());
		
		subject.changeState(State.Critical);
		assertEquals(1, logger.getLogCount());
		assertEquals(1, emailer.getSendCount());
		
		subject.changeState(State.OK);
		assertEquals(2, logger.getLogCount());
		assertEquals(2, emailer.getSendCount());
	}

}
