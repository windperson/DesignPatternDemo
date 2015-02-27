package behavior.chainOfResposibility;

import org.junit.Test;

public class TestChainOfResponsibility {

	
	ILogger fileLogger = new FileLogger();
	ILogger DBLogger = new DBLogger();
	
	@Test
	public void testCombined() {
		
		ILogger ConsoleLogger = new ConsoleLogger();
		ILogger fileLogger = new FileLogger();
		ILogger DBLogger = new DBLogger();
		
		ConsoleLogger.setNext(fileLogger);
		fileLogger.setNext(DBLogger);
		
		ConsoleLogger.writeLog(LogLevel.Info, "This is a info msg.");
		
		System.out.println("===");
		
		ConsoleLogger.writeLog(LogLevel.Debug, "This is a debug msg.");
		
		System.out.println("===");

		ConsoleLogger.writeLog(LogLevel.Error, "This is a error msg.");
	}
	
	@Test
	public void testConsoleLogger(){
		ILogger ConsoleLogger = new ConsoleLogger();
		ConsoleLogger.writeLog(LogLevel.Info, "This is a info msg.");
		
	}

}
