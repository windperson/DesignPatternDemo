package structure.decorator;

public class EncodingStream extends StreamDecorator {

	public EncodingStream(Stream aStream) {
		super(aStream);
	}

	@Override
	public void writeInt(int aInt) {
		//
	}

	@Override
	public void writeString(String aString) {
		//
	}

	@Override
	public void handleBufferFull() {
		
		DoHandling();
		
		this._component.handleBufferFull();
	}
	
	private void DoHandling()
	{
		System.out.println("Encoding stream...");
	}

}
