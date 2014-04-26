package structure.decorator;

public class CompressingStream extends StreamDecorator {

	public CompressingStream(Stream aStream) {
		super(aStream);
	}

	@Override
	public void writeInt(int aInt) {
		this._component.writeInt(aInt);
	}

	@Override
	public void writeString(String aString) {
		this._component.writeString(aString);
	}

	@Override
	public void handleBufferFull() {
		
		DoHandling();
		
		this._component.handleBufferFull();
	}
	
	protected void DoHandling()
	{
		System.out.println("Compressing stream...");
	}

}
