package structure.adpater;

public class Adapter implements INewAPI {

	@Override
	public String catInt(int a, int b) {
		String strA = (new Integer(a)).toString();
		String strB = (new Integer(b)).toString();
		
		return Adaptee.cat(strA, strB);
	}

}
