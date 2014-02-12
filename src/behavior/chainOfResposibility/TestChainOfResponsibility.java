package behavior.chainOfResposibility;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestChainOfResponsibility {

	@Test
	public void test() {
		ILogger logger = new ConsoleLogger();
		logger.setNext(new FileLogger());
		
		logger.write(LogLevel.Debug, "This is a debug msg.");
		logger.write(LogLevel.Info, "This is a info msg.");
	}

}
