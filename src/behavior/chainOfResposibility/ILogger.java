package behavior.chainOfResposibility;

public interface ILogger {
	void writeLog(LogLevel logLevel, String message);
	void setNext(ILogger aLogger);
}
