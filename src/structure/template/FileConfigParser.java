package structure.template;

public class FileConfigParser extends AbstractConfigParser {
	
	private String _fileName = null;
	
	public FileConfigParser(String fileName)
	{
		_fileName = fileName;
	}

	@Override
	protected void readData() {
		System.out.println("Fake read config file from:" + _fileName);
	}

	@Override
	protected void parseToken() {
		System.out.println("Fake parse token");
	}

	@Override
	protected void buildModel() {
		_pData = new PersonData();
		_pData.setName("Teddy");
		_pData.setHp(100);
	}

	@Override
	protected void validate() {
		System.out.println("validate config data from file...");
	}

}
