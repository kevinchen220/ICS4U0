/*
Roomba
Created by: Kevin Chen
Last Modified: October 12, 2020
Description: A Robot that cleans trash (Thing) from a room
*/

import becker.robots.*;

public class Roomba extends RobotSE
{
    /*
   Default Constructor
   aCity - the City the Roomba will be in
   row - the Street the Roomba will be on
   column - the Avenue the Roomba will be on
   aDirection - the Direction the Roomba will face
    */
    public Roomba(City aCity, int row, int column, Direction aDirection)
    {
        super(aCity, row, column, aDirection);
    }

    //method to be called to clean room
    public void cleanHouse()
    {
        //loops until reaches the end of the room
        while (!this.finish())
        {
            this.cleanRow();
            this.nextRow();
        }
        this.returnHome();
    }

    //cleans a row
    private void cleanRow()
    {
        //loops until reaches the end of a wall
        while (this.frontIsClear())
        {
            //checks for trash
            if (isDirty())
            {
                this.pickAllThings();
            }
            this.move();
        }
        if (isDirty())
        {
            this.pickAllThings();
        }
    }

    //checks if there is trash on the floor
    private boolean isDirty()
    {
        return this.isBesideThing(IPredicate.aThing);
    }

    //method to move to next row according to direction facing
    private void nextRow()
    {
        if (this.isFacingEast())
        {
            this.turnRight();
            if (this.frontIsClear())
            {
                this.move();
                this.turnRight();
            }
        } else if(this.isFacingWest())
        {
            this.turnLeft();
            if (this.frontIsClear())
            {
                this.move();
                this.turnLeft();
            }
        }
    }

    //method to return to starting position
    private void returnHome()
    {
        //continues to move until reaches starting Avenue
        while(this.getAvenue() != 1)
        {
            //loops until facing west
            while(!this.isFacingWest())
            {
                this.turnRight();
            }
            this.move();
        }

        //continues to move until reaches starting Street
        while(this.getStreet() != 1)
        {
            //loops until faces north
            while(!this.isFacingNorth())
            {
                this.turnRight();
            }
            this.move();
        }
        this.turnRight();
    }

    //check if the Roomba reached the end of a room
    private boolean finish()
    {
        if (this.isFacingSouth() && !this.frontIsClear())
        {
            return true;
        }
        return false;
    }

    //for testing purposes
    public static void main(String[] arg)
    {
        //variable declaration
        City dirtyRoom = new City("DirtyRoom.txt");
        Roomba roomba1 = new Roomba(dirtyRoom, 1, 1, Direction.EAST);
        Thing garbage1 = new Thing(dirtyRoom, 1, 1);
        Thing garbage2 = new Thing(dirtyRoom, 1, 2);
        Thing garbage3 = new Thing(dirtyRoom, 1, 4);
        Thing garbage4 = new Thing(dirtyRoom, 2, 3);
        Thing garbage5 = new Thing(dirtyRoom, 3, 2);
        Thing garbage6 = new Thing(dirtyRoom, 3, 5);
        Thing garbage7 = new Thing(dirtyRoom, 4, 1);
        Thing garbage8 = new Thing(dirtyRoom, 4, 4);

        roomba1.cleanHouse();
    }//end of main
}// end of class
