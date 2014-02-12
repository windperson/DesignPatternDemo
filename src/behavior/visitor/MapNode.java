package behavior.visitor;

public abstract class MapNode {
	private String name = null;
	
	public MapNode(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	abstract public void accept(INodeVisitor v);
}
