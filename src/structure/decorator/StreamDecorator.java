package structure.decorator;

public abstract class StreamDecorator extends Stream {

	protected Stream _component = null;
	
	public StreamDecorator(Stream aStream){
		_component = aStream;
	}
	
	protected abstract void DoHandling();
}
