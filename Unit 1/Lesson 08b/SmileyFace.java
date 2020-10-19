/*
SmileyFace
Created by: Kevin Chen
Last Modified: October 8, 2020
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
        Dimension size = new Dimension(400, 200);
        this.setPreferredSize(size);
    }

    //Draws two smiley faces using paintComponent
    public void paintComponent(Graphics g)
    {
        this.drawSmiley(g, 0);
        this.drawSmiley(g, 200);

    }

    //Draws smiley faces with the specified x coordinates
    private void drawSmiley(Graphics g, int x)
    {
        //Head
        g.setColor(Color.YELLOW);
        g.fillOval(x, 0, 200, 200);
        g.setColor(Color.BLACK);
        g.drawOval(x, 0, 200, 200);

        //Eyes
        g.fillOval(52 + x, 58, 20, 20);//left eye
        g.fillOval(128 + x, 58, 20, 20);//right eye

        //Mouth
        g.drawArc(25 + x, -90, 150, 250, -45, -90);
    }
}//end of class