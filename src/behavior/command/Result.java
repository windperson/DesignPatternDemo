package behavior.command;

public class Result implements IResult {

	private int _statusCode;
	private String _msg;
	
	public Result()
	{
		this(IResult.OK, "status green");
	}
	
	
	public Result(int statusCode, String message)
	{
		_statusCode = statusCode;
		_msg = message;
	}
	
	@Override
	public int getStatus() {
		return _statusCode;
	}

	@Override
	public String getMessage() {
		return _msg;
	}

	@Override
	public void setStatus(int statusCode) {
		_statusCode = statusCode;
	}

	@Override
	public void setMessage(String msg) {
		_msg = msg;
	}

}
