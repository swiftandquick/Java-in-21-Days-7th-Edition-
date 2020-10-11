package d17p1;

import javax.swing.*;
import java.net.*;
import java.io.*;

public class WebReader extends JFrame {

	JTextArea box = new JTextArea("Getting data ...");
	
	
	public WebReader() {
		super("Get File Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		/* Scroll appears after the program retrieves data from the web page.  */
		JScrollPane pane = new JScrollPane(box);
		add(pane);
		setVisible(true);
	}
	
	
	public void getData(String address) throws MalformedURLException {
		/* Changes the title to the address.  */
		setTitle(address);
		URL page = new URL(address);
		StringBuilder text = new StringBuilder();
		try {
			/* Open an HTTP URL connection, which is necessary to get an input stream from that connection.  */
			HttpURLConnection conn = (HttpURLConnection) page.openConnection();
			conn.connect();
			
			/* Use the connection's getContent() method to create a new input stream reader.  
			 * Returns an input stream representing the coonnection to the URL.  */
			InputStreamReader input = new InputStreamReader((InputStream) conn.getContent());

			/* Use that input stream reader to create a new buffered input stream reader.  */
			BufferedReader buff = new BufferedReader(input);
			box.setText("Getting data ...");
			String line;
			
			/** Add on codes.  The codes below display the header field keys and its respective header 
			 * fields before displaying the web page's content.  */
			String key, header;
			int i =0;
			do {
				key = conn.getHeaderFieldKey(i);
				header = conn.getHeaderField(i);
				if (key == null) {
					key = "";
				}
				else {
					key = key + ":  ";
				}
				if (header != null) {
					text.append(key);
					text.append(header);
					text.append("\n");
				}
				i++;
			} while (header != null);
			text.append("\n");
			/** Add on codes end here.  */
			
			/* The information are print out in code format.  */			
			do {
				/* As long as the next line isn't null, keep reading the next line and 
				 * append the next line to the StringBuilder.  */
				line = buff.readLine();
				text.append(line);
				text.append("\n");
			} while (line != null);
			/* Prints the text StringBuilder inside the box JTextField.  */
			box.setText(text.toString());
		}
		catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		try {
			WebReader app = new WebReader();
			app.getData("https://www.youtube.com/watch?v=oPVte6aMprI&ab_channel=QuietQuest-StudyMusic");
		}
		catch (MalformedURLException mue) {
			System.out.println(mue.getMessage());
		}
	}
	
}
