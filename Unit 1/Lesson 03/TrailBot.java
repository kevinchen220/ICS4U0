/*
TrailBot
Created by: Kevin Chen
Last Modified: September 29, 2020
Description: An extension to Robot.
             Leaves Things behind it when moving.
 */

import becker.robots.*;

public class TrailBot extends Robot
{
    //Default constructor to put 100 Things in Robot's backpack
    public TrailBot(City myCity, int row, int column, Direction aDirection)
    {
        super(myCity, row, column, aDirection, 100);
    }

    //Leaves a Thing and Moves
    public void trailMove()
    {
        this.putThing();
        this.move();
    }
}
