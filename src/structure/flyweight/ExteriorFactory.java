package structure.flyweight;

import java.util.Hashtable;

public class ExteriorFactory {
	
	private Hashtable<String, IExterior> _pool = new Hashtable<>();

	private static ExteriorFactory _instance = new ExteriorFactory();
	public static ExteriorFactory getInstance() {
		return _instance;
	}
	
	public synchronized IExterior getFlyweight(String fileName){
		
		if(null == fileName){
			throw new RuntimeException("file name cannot be null.");
		}
		
		if(null == _pool.get(fileName)){
			_pool.put(fileName, new SharedExterior(fileName));
		}
		
		return _pool.get(fileName);
	}
	
	public int getFlyweightSize(){
		return _pool.size();
	}

	
}
