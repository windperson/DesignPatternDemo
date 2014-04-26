package structure.decorator;

import java.util.ArrayList;
import java.util.List;

public class FileStream extends Stream {
	
	private List<String> _buffer;
	
	public FileStream(String fileName){
		_buffer  = new ArrayList<>();
	}

	@Override
	public void writeInt(int aInt) {
		_buffer.add(Integer.toString(aInt));
	}

	@Override
	public void writeString(String aString) {
		_buffer.add(aString);
	}

	@Override
	public void handleBufferFull() {
		System.out.println("Write data to file...");
		for (String item : _buffer) {
			System.out.print(item);
			System.out.println();
		}
		System.out.println("end of file.");
	}

}
