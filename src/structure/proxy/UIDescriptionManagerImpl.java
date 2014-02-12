package structure.proxy;

public class UIDescriptionManagerImpl implements IUIDescriManager {

	@Override
	public String getDescription(String id) throws DescriptionNotFoundException {
		return LoadDescriptionFromDB();
	}
	
	private String LoadDescriptionFromDB(){
		System.out.println("load description from DB");
		return "";
	}

}
