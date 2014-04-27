package behavior.visitor;

public class GenerateDescriptionVisitor implements INodeVisitor {

	@Override
	public void visitArchitecture(ArchitectureNode node) {
		System.out.println("Arch:" + node.getClass() +" name=" + node.getName());
	}

	@Override
	public void visitFruniture(FurnitureNode node) {
		// do nothing
	}

}
