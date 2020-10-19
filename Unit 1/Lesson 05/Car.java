/*
Car
Created by: Kevin Chen
Last Modified: October 1, 2020
Description: A robot that looks like a Car
 */

import becker.robots.*;

public class Car extends RobotSE
{
    /*
    Default Constructor
    city - the City the car will be in
    row - the Street the Car will be on
    column - the Avenue the Car will be on
    aDirection - the Direction the Car will face
     */
    public Car(City city, int row, int column, Direction aDirection)
    {
        super(city, row, column, aDirection);
        this.setIcon(new CarIcon());       //Sets Car Icon
    }

    //Overrides move method to only move if clear
    public void move()
    {
        if (frontIsClear()) //Checks if it is clear to move.
        {
            super.move();
        }
    }

    //Overrides move(int) method. Stops moving if not clear to move
    public void move(int d)
    {
        for (int i = 0; i < d; i++)
        {
            if (frontIsClear())
            {
                super.move();
            } else {
                break;
            }
        }//end of for loop
    }

    //To test if Car works
    public static void main(String[] args)
    {
        City myCity = new City();
        Car newCar = new Car(myCity, 1, 1, Direction.NORTH);

        newCar.move(5);
    }//end of main
}//end of class
