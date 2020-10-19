/*
StairMaster
Created by: Kevin Chen
Last Modified: September 29, 2020
Description: An extension of RobotSE.
             Designed to climb stairs.
 */

import becker.robots.*;

public class StairMaster extends RobotSE
{
    //Default Constructor
    public StairMaster(City myCity, int row, int column, Direction aDirection)
    {
        super(myCity, row, column, aDirection);
    }

    //How to step up
    public void stepUp()
    {
        this.turnLeft();
        this.move();
        this.turnRight();
        this.move();
    }

    //How to step down
    public void stepDown()
    {
        this.move();
        this.turnRight();
        this.move();
        this.turnLeft();
    }
}
