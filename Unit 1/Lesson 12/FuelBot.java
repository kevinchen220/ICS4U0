/*
FuelBot
Created by: Kevin Chen
Last Modified: October 14, 2020
Description: a robot that requires fuel to move
 */

import becker.robots.*;

public class FuelBot extends RobotSE
{
    //Instance Variables
    private int fuelTankSize;//How big the fuel tank is
    private int fuelLeft;    //How much fuel is left

    /*
    Default Constructor
    aCity - the City FuelBot will be in
    row - the Street fuelBot will be on
    column - the Avenue fuelBot will be on
    aDirection - the initial Direction fuelBot will be facing
    fuelTank - how large the fuel tank will be for this fuelBot
     */
    public FuelBot(City aCity, int row, int column, Direction aDirection, int fuelTank)
    {
        super(aCity, row, column, aDirection);
        this.fuelTankSize = fuelTank;
        this.fuelLeft = fuelTank;
    }

    //Moves one intersection costing oe fuel
    public void move()
    {
        if (this.fuelLeft > 0)
        {
            super.move();
            this.fuelLeft --;
            this.refill();
        }

    }

    //refills when enters an intersection with a Thing
    public void refill()
    {
        if (this.isBesideThing(IPredicate.aThing))
        {
            this.fuelLeft = this.fuelTankSize;
        }
    }

    //For testing purposes
    public static void main(String[] args)
    {
        City myCity = new City();
        FuelBot bot1 = new FuelBot(myCity, 0, 0, Direction.EAST, 3);
        FuelBot bot2 = new FuelBot(myCity, 1, 0, Direction.EAST, 3);
        Thing gasStation = new Thing(myCity, 0, 2);

        bot1.move(5);
        bot2.move(5);
    }//end of main
}// end of class
