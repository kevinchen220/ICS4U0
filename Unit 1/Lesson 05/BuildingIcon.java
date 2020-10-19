/*
BuildingIcon
Created by: Kevin Chen
Last Modified: October 1, 2020
Description: Creating an Icon for Building class.
 */

import becker.robots.icons.*;
import java.awt.*;

public class BuildingIcon extends Icon
{
    //Default Constructor
    public BuildingIcon()
    {
        super();
    }

    //Override paintIcon
    public void paintIcon(Graphics g)
    {
        //main structure
        g.setColor(Color.darkGray);
        g.fillRect(0, 0, 100, 35);

        //rooftop
        g.setColor(Color.GRAY);
        g.fillRect(10, 10, 60, 15);
        g.fillOval(78, 8, 19, 19);
    }
}

