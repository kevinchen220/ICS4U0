/*
SmileyFace
Created by: Kevin Chen
Last Modified: September 30, 2020
Description: Draws a smiley face using swing GUI.
 */

import javax.swing.*;
import java.awt.*;

public class SmileyFace extends JComponent
{

    //Default constructor
    public SmileyFace()
    {
        super();
        Dimension size = new Dimension(200, 200);
        this.setPreferredSize(size);
    }

    //Draws a smiley face using paintComponent
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        //Head
        g.setColor(Color.YELLOW);
        g.fillOval(0, 0, 200, 200);
        g.setColor(Color.BLACK);
        g.drawOval(0, 0, 200, 200);

        //Eyes
        g.fillOval(52, 58, 20, 20);//left eye
        g.fillOval(128, 58, 20, 20);//right eye

        //Mouth
        g.drawArc(25, -90, 150, 250, -45, -90);
    }
}
