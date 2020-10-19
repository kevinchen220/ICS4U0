/*
CarIcon
Created by: Kevin Chen
Last Modified: October 1, 2020
Description: Creates an Icon for Car
 */

import becker.robots.icons.*;
import java.awt.*;

public class CarIcon extends Icon
{
    //Default Constructor
    public CarIcon()
    {
        super();
    }

    //Overrides paintIcon to draw a CarIcon
    public void paintIcon(Graphics g)
    {
        //base of car
        g.setColor(Color.darkGray);
        g.fillRoundRect(25, 5, 50, 90, 20, 30);

        //top and front of car
        g.setColor(Color.gray);
        g.fillRoundRect(36, 45, 28, 40, 10, 10);
        g.fillRoundRect(30, 9, 40, 15, 20, 10);
        g.fillRect(30, 16 , 40, 10);

        //Windows of the car
        g.setColor(Color.lightGray);
        g.fillPolygon(new int[]{38, 62, 69, 31}, new int[]{41, 41, 30, 30}, 4);
        g.fillPolygon(new int[]{29, 29, 33, 33}, new int[]{38, 64, 64, 45}, 4);
        g.fillPolygon(new int[]{29, 29, 33, 33}, new int[]{86, 67, 67, 84}, 4);
        g.fillPolygon(new int[]{71, 71, 67, 67}, new int[]{38, 64, 64, 45}, 4);
        g.fillPolygon(new int[]{71, 71, 67, 67}, new int[]{86, 67, 67, 84}, 4);
        g.fillPolygon(new int[]{38, 62, 65, 35}, new int[]{88, 88, 92, 92}, 4);

    }
}
