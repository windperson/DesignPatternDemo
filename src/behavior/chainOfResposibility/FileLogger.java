package behavior.chainOfResposibility;

import java.util.Date;

public class FileLogger implements ILogger {
	
	private ILogger _next = null;

	@Override
	public void writeLog(LogLevel logLevel, String message) {
		
		System.out.println("\nFileLogger:");
		
		String msg = logLevel + ": " + new Date() + ", " + message;
		
		if(LogLevel.Debug == logLevel){
			System.out.println("==> Write to file:" + msg);
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
