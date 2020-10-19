/*
LakeIcon
Created by: Kevin Chen
Last Modified: October 1, 2020
Description: An Icon made for Lake
 */

import becker.robots.icons.*;
import java.awt.*;

public class LakeIcon extends Icon
{
    //Default Constructor
    public LakeIcon()
    {
        super();
    }

    //Overrides paintIcon to draw Lake
    public void paintIcon(Graphics g)
    {
        //A lot of circles to make a Lake
        g.setColor(new Color(0, 230, 255));
        g.fillOval(30, 30, 70, 70);
        g.fillOval(20, 5, 65,65);
        g.fillOval(55, 0, 45, 45);
        g.fillOval(0, 40, 60, 60);
        g.fillOval(5, 0, 40, 40);
        g.fillOval(5, 30, 20, 20);
    }
}
