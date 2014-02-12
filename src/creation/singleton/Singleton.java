package creation.singleton;

public class Singleton {
	private static Singleton instance = null;
	
	protected Singleton()
	{
		//left for empty.
	}
	
	public static Singleton getInstance()
	{
		if(null == instance)
		{
			instance = new Singleton();
		}
		return instance;
	}

}
