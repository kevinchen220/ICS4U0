/*
RobotMover
Created by: Kevin Chen
Last modified: Sep 25, 2020
Description: A robot that can move things around
 */

import becker.robots.*;

public class RobotMover
{
    public static void main(String[] args)
    {
        //create the City and contents
        City myCity = new City();                                           //The city
        Robot garbageTruck = new Robot(myCity, 1, 0, Direction.EAST); //The robot
        Thing garbage = new Thing(myCity, 1, 2);                      //The thing

        //Driving the garbage truck
        garbageTruck.move();
        garbageTruck.move();
        garbageTruck.pickThing();
        garbageTruck.move();
        garbageTruck.turnLeft();
        garbageTruck.turnLeft();
        garbageTruck.turnLeft();
        garbageTruck.move();
        garbageTruck.putThing();
        garbageTruck.move();

    }// end of main
}// end of class