package behavior.command;

import java.util.ArrayList;
import java.util.List;

public class Server {
	
	List<ICommand> _commands = new ArrayList<>();
	
	public Server()
	{
		
	}
	
	public void addCmd(ICommand cmd)
	{
		_commands.add(cmd);
	}
	
	public void removeCmd(ICommand cmd)
	{
		_commands.remove(cmd);
	}
	
	public void monitor()
	{
		for(ICommand cmd: _commands )
		{
			IResult result = cmd.execute();
			if(IResult.OK != result.getStatus())
			{
				sendAlert(result.getMessage());
			}
		}
	}
	
	private void sendAlert(String str)
	{
		System.out.println("Alert: " + str);
	}

}
