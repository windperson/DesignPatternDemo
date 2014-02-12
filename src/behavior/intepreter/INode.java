package behavior.intepreter;

public interface INode {
	void parse(IContext context);
	void execute();
}
