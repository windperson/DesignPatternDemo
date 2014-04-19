package creation.builder;

public class JsonConfigPropertyBuilder implements IConfigPropertyBuilder {
	
	String _platform = null;
	int _timeout = -1;
	String _location = null;
	
	private JsonConfigPropertyBuilder(){};
	
	public static IConfigPropertyBuilder GetBuilder(){
		return new JsonConfigPropertyBuilder();
	}

	@Override
	public IConfigPropertyBuilder platform(String aValue) {
		_platform = aValue;
		return this;
	}

	@Override
	public IConfigPropertyBuilder timeout(int aValue) {
		_timeout = aValue;
		return this;
	}

	@Override
	public IConfigPropertyBuilder location(String aPath) {
		_location = aPath;
		return this;
	}

	@Override
	public String builder() throws ConfigurationError {
		if(null == _location){
			throw new ConfigurationError("THE LOCATION property must be set.");
		}
		
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		
		sb.append(getJsonElementStr("TIMEOUT", _timeout)).append(",");
		
		if(null == _platform) {
			throw new ConfigurationError("THE PLATFORM property must be set.");
		}
		sb.append(getJsonElementStr("PLATFORM", _platform)).append(",");
		
		
		sb.append(getJsonElementStr("LOCATION", _location));
		sb.append("}");
		
		return sb.toString();
	}
	
	private String getJsonElementStr(String aKey, String aValue){
		return "'" + aKey + "':" + "'" + aValue + "'";
	}
	
	private String getJsonElementStr(String aKey, int aValue){
		return "\'" + aKey + "':" + aValue;
	}

}
