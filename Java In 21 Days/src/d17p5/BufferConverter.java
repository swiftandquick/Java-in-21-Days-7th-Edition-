package d17p5;

import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;
import java.nio.charset.*;

public class BufferConverter {

	public static void main(String[] args) {

		try {
			// Read byte data into a byte buffer.  
			String data = "src/d17p5/friends.dat";
			FileInputStream inData = new FileInputStream(data);
			
			// Creates a object inChannel with instance of FileChannel.  
			FileChannel inChannel = inData.getChannel();

			/* source is an object with ByteBuffer instance, set source equal 
			 * to the size of inChannel so I can encode the whole string.  */
			long inSize = inChannel.size();
			ByteBuffer source = ByteBuffer.allocate((int) inSize);
			
			/* Reads source (ByteBuffer), start at position 0.  */
			inChannel.read(source, 0);
			
			/* source (ByteBuffer) also starts at position 0.  */
			source.position(0);
		
			/* As long as there are still remaining bytes to read, get the next byte, 
			 * and print it out in numerical format.  */
			for (int i = 0; source.remaining() > 0; i++) {
				System.out.print(source.get() + " ");
			}
			
			System.out.println();
			
			/* Reset source (ByteBuffer) to start at position 0 again.  */
			source.position(0);
			
			/* Creates a Charset of "US-ASCII" type.  */
			Charset ascii = Charset.forName("US-ASCII");
			
			/* Creates a decoder (CharsetDecoder) and make it decode source (ByteBuffer).  */
			CharsetDecoder toAscii = ascii.newDecoder();
			CharBuffer destination = toAscii.decode(source);
			
			/* Make destination start at position 0.  */
			destination.position(0);
			
			/* As long as there are remaining bytes to read, get the next byte, and 
			 * print it out in US-ASCII (text) format.  */
			for (int i = 0; destination.remaining() > 0; i++) {
				System.out.print(destination.get());
			}
		}

		catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		}
		
		catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		
	}
	
}
