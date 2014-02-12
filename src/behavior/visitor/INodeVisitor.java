package behavior.visitor;

public interface INodeVisitor {
	
	void visitArchitecture(ArchitectureNode node);
	void visitFruniture(FurnitureNode node);

}
