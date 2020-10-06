package d9p9;

import java.awt.*;
import javax.swing.*;

public class DVRControl extends JFrame {

	JButton play = new JButton("Play");
	JButton se = new JButton("Stop/Ejectt");
	JButton rewind = new JButton("Rewind");
	JButton fastForward = new JButton("Fast Forward");
	JButton pause = new JButton("Pause");
	
	public DVRControl() {
		super("DVR Control");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		add(play);
		add(se);
		add(rewind);
		add(fastForward);
		add(pause);
		
		pack();
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new DVRControl();
	}
	
	
}
