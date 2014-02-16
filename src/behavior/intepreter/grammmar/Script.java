package behavior.intepreter.grammmar;

import behavior.intepreter.IContext;
import behavior.intepreter.INode;

public class Script implements INode {
	private INode _commandList;

	@Override
	public void parse(IContext context) {
		context.skipToken("SCRIPT");
		_commandList = new CommandList();
		_commandList.parse(context);
	}

	@Override
	public void execute() {
		_commandList.execute();
	}

}
