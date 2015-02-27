package structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Node1 extends AbstractNodeComponent {
	
	private List<IComponent> _list;
	private String _objectID;
	

	public Node1(String objectID) {
		super();
		_list = new ArrayList<>();
		_objectID = objectID;
	}

	@Override
	public void Operation() {
		System.out.println("" + this.getClass() + "-" + _objectID +" Operation");
	}

	public void setChild(IComponent component){
		_list.add(component);
	}
	
	@Override
	IComponent getChild(int index) {
		return _list.get(index);
	}

}
