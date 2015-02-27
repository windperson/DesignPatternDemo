package structure.composite;

public class Leaf1 extends AbstractLeafComponent {
	
	private String _objectID;
	
	public Leaf1(String _objectID) {
		super();
		this._objectID = _objectID;
	}

	@Override
	public void Operation() {
		System.out.println("" + this.getClass() + "-" + _objectID +" Operation");
	}

}
