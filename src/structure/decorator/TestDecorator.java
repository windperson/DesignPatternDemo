package structure.decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDecorator {

	@Test
	public void test() {
		Stream encodedAndCompressedStream = new EncodingStream(
												new CompressingStream(
													new FileStream("a.txt")));
		
		encodedAndCompressedStream.handleBufferFull();
	}

}
