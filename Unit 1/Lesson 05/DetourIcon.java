/*
DetourIcon
Created by: Kevin Chen
Last Modified: October 1, 2020
Description: An Icon made for Detour
 */

import becker.robots.icons.*;
import java.awt.*;

public class DetourIcon extends Icon
{
    //Default Constructor
    public DetourIcon()
    {
        super();
    }

    //Overrides paintIcon to draw Detour sign
    public void paintIcon(Graphics g)
    {
        //the arrows in the background
        g.fillPolygon(new int[] {0,20,20}, new int[] {20,40,0}, 3);
        g.fillRect(20, 10, 65, 20);
        g.fillPolygon(new int[] {100, 80, 80}, new int[] {20,40,0}, 3);

        //the word "Detour"
        g.setColor(Color.WHITE);
        g.drawString("Detour", 32, 23);
    }
}
