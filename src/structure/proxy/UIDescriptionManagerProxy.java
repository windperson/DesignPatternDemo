package structure.proxy;

import java.util.Hashtable;

public class UIDescriptionManagerProxy implements IUIDescriManager {
	
	private IUIDescriManager source;
	private Hashtable<String, String> map;

	public UIDescriptionManagerProxy(IUIDescriManager source){
		this.source = source;
		map = new Hashtable<>();
	}
	
	@Override
	public String getDescription(String id) throws DescriptionNotFoundException {
		if(!isCached(id)){
			cacheDescription(id,source.getDescription(id));
		}
		return getCached(id);
	}
	
	private boolean isCached(String id){
		if(null == map.get(id)){
			return false;
		}
		else{
			return true;
		}
	}
	
	private String getCached(String id){
		return map.get(id);
	}
	
	private void cacheDescription(String id, String value){
		map.put(id, value);
	}

}
