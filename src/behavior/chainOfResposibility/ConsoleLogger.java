package behavior.chainOfResposibility;

import java.util.Date;

public class ConsoleLogger implements ILogger {

	private ILogger _next = null;
	
	@Override
	public void writeLog(LogLevel logLevel, String message) {
		
		System.out.println("\nConsoleLogger:");
		
		String msg = logLevel + ": " + new Date() + ", " + message;
		
		if(LogLevel.Info == logLevel || LogLevel.Debug == logLevel){
			System.out.println(msg);
		}
		else{
			System.out.println("don't log.");
		}
		
		if(_next != null){
			_next.writeLog(logLevel, message);
		}
		
	}

	@Override
	public void setNext(ILogger aLogger) {
		_next = aLogger;
	}

}
