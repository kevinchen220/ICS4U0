/*
Building
Created by: Kevin Chen
Last Modified: October 1, 2020
Description: A Wall that looks like a building
 */

import becker.robots.*;

public class Building extends Wall
{
    /*
    Default constructor
    city - the City Building will be in
    row  - the Street Building will be on
    column - the Avenue Building will be on
    aDirection - the Direction Building will be facing
     */
    public Building(City city, int row, int column, Direction aDirection)
    {
        super(city, row, column, aDirection);
        this.setIcon(new BuildingIcon()); // Sets icon that displays Building
    }

    //To test if Building works properly
    public static void main(String[] args)
    {
        City myCity = new City();
        Building building1 = new Building(myCity, 1, 3, Direction.WEST);
        Car car1 = new Car(myCity, 1, 1, Direction.EAST);
        car1.move(3); // The Car will not actually crash since it will only move if it is clear to move.
    }//end of main
}//end of class
