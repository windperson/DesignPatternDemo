package behavior.command.commands.remoteThermal;

import behavior.command.ICommand;
import behavior.command.IResult;
import behavior.command.Result;

public class RemoteThermalCommand implements ICommand {
	
	private RemoteThermal _thermal = null;
	
	public RemoteThermalCommand(String ip)
	{
		_thermal = new RemoteThermal(ip);
	}

	@Override
	public IResult execute() {
		IResult result = new Result();
		
		if(_thermal.isOverheat())
		{
			result.setStatus(IResult.CRITICAL);
			result.setMessage("Too hot! : " + this.toString());
		}
		
		return result;
	}
	

}
