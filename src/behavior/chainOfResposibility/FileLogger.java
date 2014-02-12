package behavior.chainOfResposibility;

import java.util.Date;

public class FileLogger implements ILogger {
	
	private ILogger _next = null;

	@Override
	public void write(LogLevel aLevel, String aMsg) {
		
		System.out.println("\nFileLogger:");
		
		String msg = aLevel + ": " + new Date() + ", " + aMsg;
		
		if(LogLevel.Debug == aLevel){
			System.out.println("==> Write to file:" + msg);
		}
		else{
			System.out.println("don't log.");
		}
		
		if(_next != null){
			_next.write(aLevel, aMsg);
		}
	}

	@Override
	public void setNext(ILogger aLogger) {
		_next = aLogger;
	}

}
