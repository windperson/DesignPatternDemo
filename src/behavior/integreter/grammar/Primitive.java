package behavior.integreter.grammar;

import behavior.intepreter.IContext;
import behavior.intepreter.INode;

public class Primitive implements INode {
	
	private String _cmd;
	private String _text;
	private IContext _context;

	@Override
	public void parse(IContext context) {
		_context = context;
		_cmd = context.currentToken();
		context.skipToken(_cmd);
		
		switch(_cmd){
			case "DEL":
			case "CD":
			case "CALL":
				_text = context.currentToken();
				context.nextToken();
				break;
			default:
				System.out.println("Undefined primitive");
				break;
		}
	}

	@Override
	public void execute() {
		switch(_cmd){
			case "DEL":
				System.out.println("Delete file: '"+ _text + "'");
				break;
			case "CD":
				System.out.println("Change to directory: '"+ _text + "'");
				break;
			case "CALL":
				System.out.println("Call block, ID= '" + _text + "'");
				INode block = _context.getBlock(_text);
				block.execute();
				break;
			default:
				throw new RuntimeException("Unknown execute command.");
		}
	}

}
