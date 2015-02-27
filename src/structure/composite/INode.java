package structure.composite;

public interface INode extends IComponent {

	boolean Add(IComponent comp);
	
	boolean Remove(IComponent comp);

}
