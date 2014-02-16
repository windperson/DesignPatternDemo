package behavior.intepreter.grammmar;

import java.util.LinkedList;
import java.util.List;

import behavior.intepreter.IContext;
import behavior.intepreter.INode;

public class CommandList implements INode {
	
	private List<INode> _commands = new LinkedList<>();

	@Override
	public void parse(IContext context) {
		while(true){
			if(null == context.currentToken()){
				System.out.println("Missing END");
				break;
			}
			else if(context.currentToken().equals("END")){
				context.skipToken("END");
				break;
			}
			else{
				INode command = new Command();
				command.parse(context);
				_commands.add(command);
			}
		}
	}

	@Override
	public void execute() {
		for(INode cmd : _commands){
			cmd.execute();
		}
	}

}
