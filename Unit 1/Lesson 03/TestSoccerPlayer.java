/*
SoccerPlayer
Created by: Kevin Chen
Last Modified: September 29, 2020
Description: Tests the class SoccerPLayer to see if it works properly.
 */

import becker.robots.*;

public class TestSoccerPlayer
{
    public static void main(String[] args)
    {
        //variable declaration
        SoccerField court = new SoccerField();//The field

        //the SoccerPlayer
        SoccerPlayer messi = new SoccerPlayer(court, 4, 1, Direction.EAST);

        //SoccerPlayer movements
        messi.moveLeft(3);
        messi.moveRight(3);
        messi.moveLeft();
        messi.moveRight();
        messi.move();
        messi.turnAround();
        messi.move(2);
        messi.advance(7);
        messi.turnAround();
        messi.advanceRight(3);
        messi.advanceLeft(3);
        messi.advanceRight();
        messi.advanceLeft();
        messi.advance();
    }//end of main
}//end of class
