package behavior.command.commands.remoteWindow;

public class RemoteWindow {
	
	private String _ip;
	private int _status;
	
	public static int NORMAL = 0;
	public static int OPEN = 1;
	public static int BROKEN = -1;
	
	public RemoteWindow()
	{
		this("127.0.0.1");
	}
	
	public RemoteWindow(String ip)
	{
		this(ip, NORMAL);
	}
	
	public RemoteWindow(String ip, int status)
	{
		_ip = ip;
		_status = status;
	}
	
	public boolean isBroken()
	{
		return getStatus() == BROKEN;
	}
	
	public boolean isOpen()
	{
		return getStatus() == OPEN;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public String getIp() {
		return _ip;
	}

	public void setIp(String ip) {
		_ip = ip;
	}
	
	

}
