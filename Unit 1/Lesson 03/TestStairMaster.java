/*
TestStairMaster
Created by: Kevin Chen
Last Modified: September 29, 2020
Description: Tests to see if StairMaster class works properly.
 */

import becker.robots.*;

public class TestStairMaster
{
    public static void main(String[] Args)
    {
        //Variable Declaration
        City stairs = new City("StairCity.txt");//Import map through text file

        //Two StairMasters
        StairMaster climber1 = new StairMaster(stairs, 5, 1, Direction.EAST);
        StairMaster climber2 = new StairMaster(stairs, 5, 11, Direction.EAST);

        //climber1 actions
        climber1.move();
        climber1.pickThing();
        climber1.stepUp();
        climber1.pickThing();
        climber1.stepUp();
        climber1.pickThing();
        climber1.stepUp();
        climber1.pickThing();
        climber1.stepDown();
        climber1.pickThing();
        climber1.stepDown();
        climber1.pickThing();
        climber1.stepDown();
        climber1.pickThing();
        climber1.move();
        climber1.move();
        climber1.move();

        //transfer of Things
        climber1.putAllThings();
        climber2.pickAllThings();

        //climber 2 actoins
        climber2.move();
        climber2.putThing();
        climber2.stepUp();
        climber2.putThing();
        climber2.stepUp();
        climber2.putThing();
        climber2.stepUp();
        climber2.putThing();
        climber2.stepDown();
        climber2.putThing();
        climber2.stepDown();
        climber2.putThing();
        climber2.stepDown();
        climber2.putThing();
        climber2.move();
    }//end of main
}//end of class
