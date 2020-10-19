/*
Lake
Created by: Kevin Chen
Last Modified: October 1, 2020
Description: A Thing that looks like a Lake
 */

import becker.robots.*;

public class Lake extends Thing
{
    /*
    Default Constructor
    city - the City Lake will be in
    row - the Street Lake will be on
    column - the Avenue Lake will be on
     */
    public Lake(City city, int row, int column)
    {
        super(city, row, column);
        this.setBlocksEntry(true, true, true, true);// Set to cannot pass
        this.setIcon(new LakeIcon());//Set to LakeIcon
    }

    //For testing
    public static void main(String[] args)
    {
        City myCity = new City();
        Car newCar = new Car(myCity, 1, 1, Direction.NORTH);
        Lake lake1 = new Lake(myCity, 1, 2);

        newCar.turnRight();
        newCar.move(); //Car will not actually crash because it checks before moving
                       //Also means that Lake cannot be passed which is what we want
    }//end of main
}//end of class
