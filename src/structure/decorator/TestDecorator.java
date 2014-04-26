package structure.decorator;

import org.junit.Test;

public class TestDecorator {

	@Test
	public void test() {
		Stream encodedAndCompressedStream = new EncodingStream(
												new CompressingStream(
													new FileStream("a.txt")));
		
		encodedAndCompressedStream.writeString("User = teddy");
		encodedAndCompressedStream.writeInt(8080);
		
		encodedAndCompressedStream.handleBufferFull();
	}

}
