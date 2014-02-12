package creation.builder;

public interface IConfigPropertyBuilder {
	IConfigPropertyBuilder platform(String aValue);
	IConfigPropertyBuilder timeout(int aValue);
	IConfigPropertyBuilder location(String aPath);
	
	String builder() throws ConfigurationError;
	
}
