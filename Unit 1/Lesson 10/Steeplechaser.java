/*
Steeplechaser
Created by: Kevin Chen
Last Modified: October 12, 2020
Description: A Robot that jumps over obstacles
*/

import becker.robots.*;

public class Steeplechaser extends RobotSE
{
    /*
    Default Constructor
    aCity - the City the Robot will be in
    row - the Street the Robot will be on
    column - the Avenue the Robot will be on
    aDirection - the Direction the Robot will face
     */
    public Steeplechaser(City aCity, int row, int column, Direction aDirection)
    {
        super(aCity, row, column, aDirection);
    }

    //method to be executed
    public void runRace()
    {
        boolean run = true;
        //loops until reaches finish line
        while (run)
        {
            if (this.isBesideThing(IPredicate.aFlasher))
            {
                run = false;
            } else
            {
                this.raceStride();
            }
        }

    }

    //Moves if clear and jumps if there is an obstacle
    private void raceStride()
    {
        if (this.frontIsClear())
        {
            this.move();
        } else
        {
            this.jumpBarrier();
        }
    }

    //jumps the barrier and lands
    private void jumpBarrier()
    {
        this.turnLeft();
        int climb = 0;
        //loops until top and keeps track of distance
        while (!this.checkTop())
        {
            this.move();
            climb++;
        }
        this.move();
        this.turnRight();
        this.move(climb);
        this.turnLeft();
    }

    //checks if the Robot is at the top of the obstacle
    private boolean checkTop()
    {
        this.turnRight();
        if (this.frontIsClear())
        {
            return true;
        } else
        {
            this.turnLeft();
            return false;
        }
    }

    //for testing purposes
    public static void main(String[] args)
    {
        City track = new City("steeplechase.txt");
        Steeplechaser racer = new Steeplechaser(track, 5, 0, Direction.EAST);
        Flasher finish = new Flasher(track, 5, 12);

        racer.runRace();
    }//end of main

}//end of class
