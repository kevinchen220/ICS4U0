/*
Mountain Climber
Created by: Kevin Chen
Last Modified: Sep 25, 2020
Description: A robot that climbs a mountain
 */

import becker.robots.*;

public class MountainClimber
{
    public static void main(String[] args)
    {
	    // Create the City, Mountain, Climber
        City myCity = new City();                                     // the city
        Robot climber = new Robot(myCity, 3, 0, Direction.EAST);// the climber
        Thing flag = new Thing(myCity, 3, 1);                   // the flag
        //The mountain
        Wall mountain1 = new Wall(myCity, 3, 2, Direction.WEST);
        Wall mountain2 = new Wall(myCity, 3, 2, Direction.NORTH);
        Wall mountain3 = new Wall(myCity, 2, 3, Direction.WEST);
        Wall mountain4 = new Wall(myCity, 1, 3, Direction.WEST);
        Wall mountain5 = new Wall(myCity, 1, 3, Direction.NORTH);
        Wall mountain6 = new Wall(myCity, 1, 3, Direction.EAST);
        Wall mountain7 = new Wall(myCity, 2, 4, Direction.NORTH);
        Wall mountain8 = new Wall(myCity, 2, 4, Direction.EAST);
        Wall mountain9 = new Wall(myCity, 3, 4, Direction.EAST);

        //Climber actions
        climber.move();
        climber.pickThing();// pick up flag
        climber.turnLeft();
        climber.move();
        climber.turnLeft();
        climber.turnLeft();
        climber.turnLeft();
        climber.move();
        climber.turnLeft();
        climber.move();
        climber.move();
        climber.turnLeft();
        climber.turnLeft();
        climber.turnLeft();
        climber.move();
        climber.putThing();// plant flag
        climber.move();
        climber.turnLeft();
        climber.turnLeft();
        climber.turnLeft();
        climber.move();
        climber.turnLeft();
        climber.move();
        climber.turnLeft();
        climber.turnLeft();
        climber.turnLeft();
        climber.move();
        climber.move();
        climber.turnLeft();
        
    }// end of main
}// end of class
