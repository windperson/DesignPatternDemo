package structure.facade;

import structure.facade.other.*;

public class FacadeInterface {
	
	private OldAPI2 api2 = new OldAPI2();
	
	public int API1Method1()
	{
		return OldAPI1.OldMethod1();
	}
	
	public double API1Method2()
	{
		return OldAPI1.OldMethod2();
	}
	
	public String APIMethod3()
	{
		return api2.OldAPIMethod1();
	}
	
	public String APIMethod4()
	{
		return api2.OldAPIMethod2();
	}	

}
