package creation.simplefactory;

public class Product1 {
	
	private int field1;
	private double field2;
	private String field3;

	public Product1(int var1, double var2)
	{
		this(var1, var2, null);
	}
	
	public Product1(int var1, double var2, String var3)
	{
		field1 = var1;
		field2 = var2;
		field3 = var3;
	}
	
	////
	public int getField1()
	{
		return field1;
	}
	
	public double getField2()
	{
		return field2;
	}
	
	public String getField3()
	{
		return null == field3 ? "" : field3;
	}
}
