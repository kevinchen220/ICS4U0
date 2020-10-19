/*
TestEverything
Created by: Kevin Chen
Last Modified: October 1, 2020
Description: This is where all the classes made for lesson 4 are tested
 */

import becker.robots.*;

public class TestEverything
{
    public static void main(String[] args)
    {
        //Variable Declaration
        City myCity = new City();       //The City
        Car myCar = new Car(myCity, 1, 1, Direction.NORTH);//The Car
        //The Trees
        Tree tree1 = new Tree(myCity, 1, 2);
        Tree tree2 = new Tree(myCity, 4, 3);
        Tree tree3 = new Tree(myCity, 2, 5);
        Lake lake1 = new Lake(myCity, 5, 2);
        Lake lake2 = new Lake(myCity, 5, 4);
        //Detour Signs
        Detour detour1 = new Detour(myCity, 3, 4);
        Detour detour2 = new Detour(myCity, 4, 1);
        //Buildings
        Building building1 = new Building(myCity, 2, 2, Direction.WEST);
        Building building2 = new Building(myCity, 4, 5, Direction.SOUTH);

        //Car actions
        /*
        the move(int) are set to crash into the different
        objects but it does not actually crash since the Car
        checks before moving. Showing that the objects that
        are supposed to be unpassable are actually unpassable.
         */
        myCar.turnRight();
        myCar.move(4);
        myCar.turnRight();
        myCar.move(5);
        myCar.turnRight();
        myCar.move();
        myCar.turnRight();
        myCar.move(3);
        myCar.turnLeft();
        myCar.move(2);
        myCar.turnLeft();
        myCar.move(3);
        myCar.turnRight();
        myCar.move(2);
        myCar.turnRight();
        myCar.move();

    }//End of main
}//End of class
