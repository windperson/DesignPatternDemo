package behavior.intepreter.grammmar;

import behavior.intepreter.IContext;
import behavior.intepreter.INode;

public class Command implements INode {
	
	private INode _node;

	@Override
	public void parse(IContext context) {
		if(context.currentToken().equals("BLOCK")){
			_node = new Block();
			_node.parse(context);
		}
		else{
			_node = new Primitive();
			_node.parse(context);
		}

	}

	@Override
	public void execute() {
		//Do not execute block unless being called.
		if(_node instanceof Primitive){
			_node.execute();
		}
	}

}
