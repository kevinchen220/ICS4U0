/*
TreeIcon
Created by: Kevin Chen
Last Modified: October 1, 2020
Description: An Icon made for Tree
 */

import becker.robots.icons.*;
import java.awt.*;

public class TreeIcon extends Icon
{
    //Default Constructor
    public TreeIcon()
    {
        super();
    }

    //Overrides paintIcon to draw Tree
    public void paintIcon(Graphics g)
    {
        //Trunk of the tree
        g.setColor(new Color(140, 100, 0));
        g.fillRect(40, 40, 20, 50);

        //Leaves
        g.setColor(Color.green);
        g.fillOval(30, 0, 40, 40);
        g.fillOval(17, 21, 40, 40);
        g.fillOval(43, 21, 40, 40);
    }
}
