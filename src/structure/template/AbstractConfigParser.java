package structure.template;

public abstract class AbstractConfigParser {
	
	protected PersonData _pData = null;
	
	public  final PersonData doParse()
	{
		readData();
		parseToken();
		buildModel();
		validate();
		return _pData;
	}

	abstract protected void readData();

	abstract protected void parseToken();
	
	abstract protected void buildModel();
	
	abstract protected void validate();
}
