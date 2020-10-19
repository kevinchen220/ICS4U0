/*
Lamp
Created by: Kevin Chen
Last Modified: September 29, 2020
Description: An extension of thing that that acts like a lamp.
             Should light up when a robot drives over.
 */

import becker.robots.*;
import becker.robots.icons.*;

import java.awt.*;

public class Lamp extends Thing
{
    //Creating icons for the lamp
    CircleIcon on = new CircleIcon(Color.yellow, 0.95);
    CircleIcon off = new CircleIcon(Color.gray, 0.3);

    //Default constructor in off position and set transparency of on
    public Lamp(City myCity, int row, int column)
    {
        super(myCity, row, column);
        this.turnOff();
        on.setTransparency(0.5);
    }

    //Turns on lamp
    public void turnOn()
    {
        this.setIcon(on);
    }

    //turns off lamp
    public void turnOff()
    {
        this.setIcon(off);
    }

    //Checks if robot is over the lamp and turns o if it is
    public void check(becker.robots.Robot r1)
    {
        //Comparing intersections
        if (this.getIntersection() == r1.getIntersection())
        {
            this.turnOn();
        }
    }
}
