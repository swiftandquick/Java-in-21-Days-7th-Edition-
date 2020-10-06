package d13p5;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class PiePanel extends JPanel {

	/* PieSlice[] array.  */
	private PieSlice[] slice;
	private int current = 0;
    private float totalSize = 0;
    private Color background;

    
    /* sliceCount is 4, set slices equal to 4.  */
    public PiePanel(int sliceCount) {
        slice = new PieSlice[sliceCount];
        background = getBackground();
    }

    
    /* Calculate totalSize.  */
    public void addSlice(Color sColor, float sSize) {
        if (current <= slice.length) {
        	/* Passes PieSlice's color and size into PieSlice's constructor.  */
            slice[current] = new PieSlice(sColor, sSize);
            totalSize += sSize;
            current++;
        }
    }

    
    public void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D) comp;
        int width = getSize().width - 10;
        int height = getSize().height - 15;
        int xInset = 5;
        int yInset = 5;
        if (width < 5) {
            xInset = width;
        }
        if (height < 5) {
            yInset = height;
        }
        comp2D.setColor(background);
        comp2D.fillRect(0, 0, getSize().width, getSize().height);
        comp2D.setColor(Color.lightGray);
        Ellipse2D.Float pie = new Ellipse2D.Float(
            xInset, yInset, width, height);
        comp2D.fill(pie);
        float start = 0;
        /* For each PieSlice element in slice array.  */
        for (PieSlice slice1 : slice) {
        	/* extent is number of degrees traveled, so use the slice's size divide by total size 
        	 * then multiple by 360 should get the travel degrees value.  */
            float extent = slice1.size * 360F / totalSize;
            /* Set color equal to the each PieSlice element's respective color.  */
            comp2D.setColor(slice1.color);
            /* Draws the arc as a pie.  */
            Arc2D.Float drawSlice = new Arc2D.Float(
                xInset, yInset, width, height, start, extent,
                Arc2D.Float.PIE);
            /* start equals to sum of the current extent.  This ensures that each slide is start 
             * at the right degree.  */
            start += extent;
            comp2D.fill(drawSlice);
        }
    }
}