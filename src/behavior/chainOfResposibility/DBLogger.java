package behavior.chainOfResposibility;

public class DBLogger implements ILogger {
	
	private ILogger _next = null;

	@Override
	public void writeLog(LogLevel logLevel, String message) {
		
		System.out.println("\nDBLogger:");
		
		if(LogLevel.Error == logLevel){
			System.out.println("DB=" + message);
		}
		
		if(_next != null){
			_next.writeLog(logLevel, message);
		}else{
			System.out.println("don't log.");
		}

	}

	@Override
	public void setNext(ILogger aLogger) {
		_next = aLogger;
	}

}
