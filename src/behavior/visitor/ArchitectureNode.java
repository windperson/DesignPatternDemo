package behavior.visitor;

public class ArchitectureNode extends MapNode{

	public ArchitectureNode(String name) {
		super(name);
	}

	@Override
	public void accept(INodeVisitor v) {
		v.visitArchitecture(this);
	}

}
