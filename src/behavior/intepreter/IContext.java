package behavior.intepreter;

public interface IContext {
	void skipToken(String token);
	String nextToken();
	String currentToken();
	
	boolean containsBlock(String blockID);
	void putBlock(String blockID, INode blockNode);
	INode getBlock(String blockID);
}
