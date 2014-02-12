package structure.decorator;

public class FileStream extends Stream {
	
	public FileStream(String fileName){
		
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
		System.out.println("Write data to file...");
	}

}
