package behavior.visitor;

public class FurnitureNode extends MapNode {

	public FurnitureNode(String name) {
		super(name);
	}

	@Override
	public void accept(INodeVisitor v) {
		v.visitFruniture(this);
	}

}
