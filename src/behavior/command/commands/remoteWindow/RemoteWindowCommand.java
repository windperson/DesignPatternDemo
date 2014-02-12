package behavior.command.commands.remoteWindow;

import behavior.command.ICommand;
import behavior.command.IResult;
import behavior.command.Result;

public class RemoteWindowCommand implements ICommand {

	private RemoteWindow _window = null;
	
	public RemoteWindowCommand(String ip)
	{
		_window = new RemoteWindow(ip);
	}
	
	@Override
	public IResult execute() {
		
		IResult result = new Result();
		String msg = null;
		
		if(_window.isBroken())
		{
			result.setStatus(IResult.CRITICAL);
			msg = "window is broken" + this.toString();
		}
		else if(_window.isOpen())
		{
			result.setStatus(IResult.CRITICAL);
			msg = "window is opened" + this.toString();
		}
		
		if( msg != null && !"".equals(msg))
		{
			result.setMessage(msg + " : " + this.toString());
		}
		
		return result;
		
	}

}
