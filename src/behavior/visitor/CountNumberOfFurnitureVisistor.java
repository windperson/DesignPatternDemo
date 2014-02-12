package behavior.visitor;

public class CountNumberOfFurnitureVisistor implements INodeVisitor {

	private int count = 0;
	
	@Override
	public void visitArchitecture(ArchitectureNode node) {
		//Do nothing

	}

	@Override
	public void visitFruniture(FurnitureNode node) {
		count++;
	}
	
	public int getNumberOfVisistedFurnitureNode(){
		return count;
	}

}
