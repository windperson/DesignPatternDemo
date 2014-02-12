package behavior.visitor;

public class LocationCheckVisitor implements INodeVisitor {

	@Override
	public void visitArchitecture(ArchitectureNode node) {
		System.out.println("Check architecture node'" + node.getName() +"'location...");
	}

	@Override
	public void visitFruniture(FurnitureNode node) {
		System.out.println("Check furniture node'" + node.getName() +"'location...");
	}

}
