package behavior.command.commands.remoteThermal;

public class RemoteThermal {

	private String _ip;
	
	private double _currentTemp;
	
	private int overHeatLimit = 50;
	
	public RemoteThermal()
	{
		this("127.0.0.1");
	}
	
	public RemoteThermal(String ip)
	{
		this(ip, 30);
	}
	
	public RemoteThermal(String ip, double temp)
	{
		_ip = ip;
		_currentTemp = temp;
	}
	
	
	public boolean isOverheat()
	{
		return _currentTemp >= overHeatLimit; 
	}

	public String getIp() {
		return _ip;
	}

	public void setIp(String ip) {
		_ip = ip;
	}
	
}
