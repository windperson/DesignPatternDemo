package structure.proxy;

public class UIDescriptionManagerImpl implements IUIDescriManager {

	@Override
	public String getDescription(String id) throws DescriptionNotFoundException {
		return LoadDescriptionFromDB();
	}
	
	private String LoadDescriptionFromDB(){
		System.out.println("load description from DB");
		sleepMs(2000);
		return "";
	}
	
	private void sleepMs(int ms){
		try{
			Thread.sleep(ms);
		}catch(InterruptedException e){
			//ignore
		}
	}

}
