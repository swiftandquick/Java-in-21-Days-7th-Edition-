package d17p2;

/*  Run -> Run Configuration -> Arguments, 
 * set the argument as icculus@incculus.org */

import java.io.*;
import java.net.*;
import java.util.*;

public class Finger {

	public static void main(String[] args) {

		String user;
		String host;
		
		/* As long as there is only one String argument and the "@" is in index 0 or 
		 * is in a positive numbered index. In other words, the argument is an email, 
		 * execute the codes inside the block.  */
		if ((args.length == 1) && (args[0].indexOf("@") > -1)) {
			/* Splits a String into two tokens by "@", first token is icculus (before 
			 * @), second token is icculus (after @).  */
			StringTokenizer split = new StringTokenizer(args[0], "@");
			/* First token is icculus.  */
			user = split.nextToken();
			/* Second token is icculus.  */
			host = split.nextToken();
		}
		else {
			System.out.println("Usage:  java Finger user@host");
			return;
		}
		
		try {
			/* Host name is "icculus", port number is 79.  Port 79 is traditionally reserved 
			 * for Finger services.  */
			Socket digit = new Socket(host, 79);
			/* The socket is used to create an InputStream, which in turn is used to 
			 * create a buffered reader.  */
			BufferedReader input = new BufferedReader(new InputStreamReader(digit.getInputStream()));
			/* Set a 20 seconds timeout for the socket.  */
			digit.setSoTimeout(20000);
			/* The socket is used to get an output stream, which is used create a print stream.  */
			PrintStream output = new PrintStream(digit.getOutputStream());
			/* Finger protocol needs the userame to be sent through the socket, followed by 
			 * carrier return (\015) and linefeed (\012).  This is handled by calling the 
			 * print() method of the new print stream (output).  */
			output.print(user + "\015\012");
			
			/* Iterates until there is no more line to read.  Until then, keep reading and then 
			 * print the next line.  eof is false until next line is null.  */
			boolean eof = false; 
			while (!eof) {
				String line = input.readLine();
				if (line != null) {
					System.out.println(line);
				}
				else {
					eof = true;
				}
			}
			// Close the socket, associated streams will also be closed.  
			digit.close();
		}
		catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
		
	}
	
}
