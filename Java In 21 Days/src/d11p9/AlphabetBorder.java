package d11p9;

import java.awt.*;
import javax.swing.*;

class AlphabetBorder extends JFrame {
    JButton north = new JButton("North");
    JButton south = new JButton("South");
    JButton east = new JButton("East");
    JButton west = new JButton("West");
    AlphabetPanel alpha = new AlphabetPanel();

    AlphabetBorder() {
        super("AlphabetBorder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(240, 300);
        setLayout(new BorderLayout());
        add("North", north);
        add("South", south);
        add("East", east);
        add("West", west);
        /* Add alphabet panel to the center.  */
        add("Center", alpha);
        setVisible(true);
    }
    
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception e) {
            System.err.println("Couldn't use the system "
                + "look and feel: " + e);
        }
    }

    public static void main(String[] arguments) {
        AlphabetBorder.setLookAndFeel();
        new AlphabetBorder();
    }
}