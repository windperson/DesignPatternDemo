package behavior.command.commands.remoteDoor;

public class RemoteDoor {
	
	public static final String CLOSE = "close";
	public static final String HALF = "half";
	public static final String OPEN = "open";
	
	private String _ip;
	private String _status;
	
	public RemoteDoor(String ip)
	{
		this(ip, CLOSE);
	}
	
	public RemoteDoor(String ipAddr, String status)
	{
		setIp(ipAddr);
		_status = status;
	}

	public String getIp() {
		return _ip;
	}

	public void setIp(String ip) {
		_ip = ip;
	}

	public String getDoorStatus() {
		return _status;
	}

	public void setDoorStatus(String status) {
		_status = status;
	}
	
	
	
	

}
