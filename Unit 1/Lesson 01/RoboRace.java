/*
RoboRace
Created by: Kevin Chen
Last Modified: Sep 25, 2020
Description: Two cars racing in myCity.
 */

import becker.robots.*;

public class RoboRace
{
    public static void main(String[] args)
    {
        //Create the City and its contents
        City myCity = new City ();                                  //The City
        Robot abe = new Robot (myCity, 0, 1, Direction.EAST); //One of the Robots
        Robot bob = new Robot(myCity, 0, 2, Direction.WEST);  //The Second Robot
        //The walls
        Wall wall1 = new Wall(myCity, 0, 2, Direction.WEST);
        Wall wall2 = new Wall(myCity, 1, 2, Direction.WEST);
        Wall wall3 = new Wall(myCity, 2, 2, Direction.WEST);
        Wall wall4 = new Wall(myCity, 2, 2, Direction.SOUTH);

        //Move the robots
        abe.turnLeft();
        abe.turnLeft();
        abe.turnLeft();
        bob.turnLeft();
        bob.move();
        abe.move();
        bob.move();
        abe.move();
        bob.turnLeft();
        bob.move();
        abe.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        abe.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        abe.move();

    } // end of main
} // end of class
