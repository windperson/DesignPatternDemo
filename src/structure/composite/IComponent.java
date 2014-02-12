package structure.composite;

public interface IComponent {
	
	void Operation();
	
	boolean Add(IComponent comp);
	boolean Remove(IComponent comp);
	IComponent getChild(int index);
	

}
