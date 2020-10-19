/*
MazeWalker
Created by: Kevin Chen
Last Modified: October 12, 2020
Description: A Robot that can walk out a maze following the right wall principle
*/

import becker.robots.*;

public class MazeWalker extends RobotSE
{
    /*
    Default Constructor
    aCity - the City the Robot will be in
    row - the Street the Robot will be on
    column - the Avenue the Robot will be on
    aDirection - the Direction the Robot will face
     */
    public MazeWalker(City aCity, int row, int column, Direction aDirection)
    {
        super(aCity, row, column, aDirection);
    }

    //follows along the wall to its right until it reachs the exit
    public void followRightWall()
    {
        boolean exit = false;
        //loops until the exit is reached
        while (!exit)
        {
            this.checkWalls();
            if (this.isBesideThing(IPredicate.aFlasher))
            {
                exit = true;
            }
        }
    }

    //Checks if it is following the wall to its right
    private void checkWalls()
    {
        turnRight();
        //loops to check walls from right to left order
        while(!this.frontIsClear())
        {
            this.turnLeft();
        }
        this.move();

    }

    //for testing purposes
    public static void main(String[] args)
    {
        //variable declaration
        int streets = 10;
        int avenues = 10;
        MazeCity maze = new MazeCity(streets, avenues);
        Flasher exit = new Flasher(maze, streets - 2, avenues - 1);
        MazeWalker bob = new MazeWalker(maze, 0, 0, Direction.EAST);

        bob.followRightWall();
    }//end of main
}// end of class
