package structure.template;

public class DBConfigParser extends AbstractConfigParser {
	
	private String _conStr = null;
	
	public DBConfigParser(String conStr)
	{
		_conStr = conStr;
	}

	@Override
	protected void readData() {
		System.out.println("Read config data from DB:" + _conStr);
	}

	@Override
	protected void parseToken() {
		System.out.println("Fake parse token");
	}

	@Override
	protected void buildModel() {
		_pData = new PersonData();
		_pData.setName("Kay");
		_pData.setHp(50);
	}

	@Override
	protected void validate() {
		System.out.println("validate config data from file...");
	}
	
}
