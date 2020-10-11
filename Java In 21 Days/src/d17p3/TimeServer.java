package d17p3;

import java.io.*;
import java.net.*;
import java.util.*;

/* The purpose is to make a Telnet connection to my TimeServer.  */

public class TimeServer extends Thread {

	private ServerSocket sock;
	
	
	public TimeServer() {
		super();
		try {
			/* Port 4415 was chosen to be monitored by the server.  */
			sock = new ServerSocket(4415);
			System.out.println("TimeServer running...");
		}
		catch (IOException ioe) {
			System.out.println(ioe.getMessage());
			System.exit(1);
		}
	}
	
	
	public void run() {
		Socket client = null;
		
		/* Endless loop, but can be exited if sock (ServerSocket) become null.  */
		while (true) {
			if (sock == null) {
				return;
			}
			try {
				client = sock.accept();
				BufferedOutputStream bb = new BufferedOutputStream(client.getOutputStream());
				PrintWriter os = new PrintWriter(bb, false);
				String outLine;
				
				Date now = new Date();
				os.println(now);
				os.flush();
				
				os.close();
				client.close();
			}
			catch (IOException ioe) {
				System.out.println(ioe.getMessage());
				System.exit(1);
			}
		}
	}
	
	
	public static void main(String[] args) {
		/* Calls the constructor.  */
		TimeServer server = new TimeServer();
		/* Use server to call the start() method, which invokes the run() method.  */
		server.start();
	}
	
	
}