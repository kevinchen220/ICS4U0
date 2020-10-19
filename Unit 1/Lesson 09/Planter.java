/*
Planter
Created by: Kevin Chen
Last Modified: October 12, 2020
Description: A Robot that plants a thing where it is empty
*/

import becker.robots.*;

public class Planter extends RobotSE
{
    /*
    Default Constructor
    aCity - the City the Planter will be in
    row - the Street the Planter will be on
    column - the Avenue the Planter will be on
    aDirection - the Direction the Planter will face
     */
    public Planter(City aCity, int row, int column, Direction aDirection)
    {
        super(aCity, row, column, aDirection, 100);
    }

    /*
    Plants a thing where it is empty
    rows - how many rows needed to be planted
     */
    public void plant(int rows)
    {
        this.move();
        //loops through to plant all rows
        for (int j = 0; j < rows; j++)
        {
            this.plantRow();
            this.nextRow();
        }
    }

    //planting a row
    private void plantRow()
    {
        //loops to check if it needs a plant and moves
        for (int i = 0; i < 5; i++)
        {
            if (!this.isBesideThing(IPredicate.aThing))
            {
                this.putThing();
            }
            if (i < 4)
            {
                this.move();
            }
        }
    }

    //advance to the next row
    private void nextRow()
    {
        if (this.isFacingEast())
        {
            this.turnRight();
            this.move();
            this.turnRight();
        } else {
            this.turnLeft();
            this.move();
            this.turnLeft();
        }
    }

    //for testing purposes
    public static void main(String[] args)
    {
        City farm = new City("Field.txt");
        Planter farmer = new Planter(farm, 1, 0, Direction.EAST);

        farmer.plant(6);
    }//end of main
}//end of class
