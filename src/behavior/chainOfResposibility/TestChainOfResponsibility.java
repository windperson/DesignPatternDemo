package behavior.chainOfResposibility;

import org.junit.Test;

public class TestChainOfResponsibility {

	@Test
	public void test() {
		ILogger logger = new ConsoleLogger();
		logger.setNext(new FileLogger());
		
		logger.writeLog(LogLevel.Debug, "This is a debug msg.");
		logger.writeLog(LogLevel.Info, "This is a info msg.");
	}

}
