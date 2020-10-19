/*
SoccerPlayer
Created by: Kevin Chen
Last Modified: September 29, 2020
Description: Extension of RobotSE to do more advanced movement with Things.
 */

import becker.robots.*;

public class SoccerPlayer extends RobotSE
{
    //Default Constructor
    public SoccerPlayer(SoccerField myCourt, int row, int column, Direction aDirection)
    {
        super(myCourt, row, column, aDirection);
    }

    //Moving one unit with ball
    public void advance()
    {
        this.pickThing();
        this.move();
        this.putThing();
    }

    //moving d units with the ball
    public void advance(int d)
    {
        this.pickThing();
        move(d);
        this.putThing();
    }

    //Moving to front left corner with ball
    public void advanceLeft()
    {
        this.pickThing();
        moveLeft();
        this.putThing();
    }

    //Moving d front left corners with ball
    public void advanceLeft(int d)
    {
        this.pickThing();
        moveLeft(d);
        this.putThing();
    }

    //Moving to font right corner with ball
    public void advanceRight()
    {
        this.pickThing();
        moveRight();
        this.putThing();
    }

    //Moving d front right corners with ball
    public void advanceRight(int d)
    {
        this.pickThing();
        moveRight(d);
        this.putThing();
    }

    //Move d units straight
    public void move(int d)
    {
        for(int i = 0; i < d; i++)
        {
            this.move();
        }
    }

    //Move to front left corner
    public void moveLeft()
    {
        this.turnLeft();
        this.move();
        this.turnRight();
        this.move();
    }

    //move to front right corner
    public void moveRight()
    {
        this.turnRight();
        this.move();
        this.turnLeft();
        this.move();
    }

    //move d front left corners
    public void moveLeft(int d)
    {
        for (int i = 0; i < d; i++)
        {
            moveLeft();
        }
    }

    //move d front right corers
    public void moveRight(int d)
    {
        for (int i = 0; i < d; i++)
        {
            moveRight();
        }
    }
}

