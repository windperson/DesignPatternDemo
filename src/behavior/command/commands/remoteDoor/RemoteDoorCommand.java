package behavior.command.commands.remoteDoor;

import behavior.command.ICommand;
import behavior.command.IResult;
import behavior.command.Result;

public class RemoteDoorCommand implements ICommand {

	private RemoteDoor _door = null;
	
	public RemoteDoorCommand(RemoteDoor door)
	{
		_door = door;
	}
	
	
	@Override
	public IResult execute() {
		
		IResult result = new Result();
		
		if(RemoteDoor.OPEN.equals(_door.getDoorStatus()))
		{
			result.setStatus(IResult.CRITICAL);
			result.setMessage("Door is opened : " + this.toString());
		}
		return result;
	}

}
