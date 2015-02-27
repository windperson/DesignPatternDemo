package structure.composite;

public class Leaf2 extends AbstractLeafComponent {

	private String _objectID;
	
	public Leaf2(String _objectID) {
		super();
		this._objectID = _objectID;
	}
	
	@Override
	public void Operation() {
		System.out.println("" + this.getClass() + "-" + _objectID +" Operation");
	}

}
