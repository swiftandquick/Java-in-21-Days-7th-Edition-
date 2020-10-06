package d11p9;

import java.awt.*;
import javax.swing.*;

public class AlphabetPanel extends JPanel {
    JButton a = new JButton("Alibi");
    JButton b = new JButton("Burglar");
    JButton c = new JButton("Corpse");
    JButton d = new JButton("Deadbeat");
    JButton e = new JButton("Evidence");
    JButton f = new JButton("Fugitive");

    AlphabetPanel() {
        FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
        setLayout(lm);
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
    }
}