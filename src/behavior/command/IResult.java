package behavior.command;

public interface IResult {
	
	final int OK = 1;
	final int WARNING = 2;
	final int CRITICAL = 3;
	
	int getStatus();
	String getMessage();
	void setStatus(int statusCode);
	void setMessage(String msg);

}
