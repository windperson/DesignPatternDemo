package behavior.integreter.grammar;

import behavior.intepreter.IContext;
import behavior.intepreter.INode;

public class Block implements INode {

	private String _blockID;
	private INode _commandList;
	
	@Override
	public void parse(IContext context) {
		context.skipToken("BLOCK");
		_blockID = context.currentToken();
		if(context.containsBlock(_blockID)){
			System.out.println("Duplicated block ID: " + _blockID);
		}
		else{
			context.putBlock(_blockID, this);
		}
		context.nextToken();
		_commandList = new CommandList();
		_commandList.parse(context);
	}

	@Override
	public void execute() {
		_commandList.execute();
	}

}
