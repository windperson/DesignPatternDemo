package creation.builder;

import java.util.ArrayList;


public class PlainTxtConfigPropertyBuilder implements IConfigPropertyBuilder {
	private ArrayList<TxtDO> _table;
	
	private PlainTxtConfigPropertyBuilder() {
		_table = new ArrayList<>();
	}
	
	public static IConfigPropertyBuilder GetBuilder(){
		return new PlainTxtConfigPropertyBuilder();
	}

	@Override
	public IConfigPropertyBuilder platform(String aValue) {
		_table.add(new TxtDO("PLATFORM",aValue));
		return this;
	}

	@Override
	public IConfigPropertyBuilder timeout(int aValue) {
		_table.add(new TxtDO("TIMEOUT", String.valueOf(aValue)));
		return this;
	}

	@Override
	public IConfigPropertyBuilder location(String aPath) {
		_table.add(new TxtDO("LOCATION", aPath));
		return this;
	}

	@Override
	public String builder() throws ConfigurationError {
		
		boolean valid = false;
		for(TxtDO t : _table){
			if(t._key == "LOCATION")
				valid = true;
		}
		
		if(!valid) {
			throw new ConfigurationError("THE LOCATION property must be set.");
		}
		
		StringBuffer sb = new StringBuffer();
		for(TxtDO t : _table){
			sb.append(t._key).append("=").append(t._value).append("\n");
		}
		return sb.toString();
	}
}


