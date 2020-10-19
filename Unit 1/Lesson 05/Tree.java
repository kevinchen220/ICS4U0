/*
Tree
Created by: Kevin Chen
Last Modified: October 1, 2020
Description: A Thing that looks like a Tree
 */

import becker.robots.*;

public class Tree extends Thing
{
    /*
    Default Constructor
    city - the City Tree will be in
    row - the Street Tree will be in
    column - the Avenue Tree will be in
     */
    public Tree(City city, int row, int column)
    {
        super(city, row, column);
        this.setCanBeCarried(false);    //Cannot be picked
        this.setIcon(new TreeIcon());   //Set to TreeIcon
    }

    //For testing
    public static void main(String[] args)
    {
        City myCity = new City();
        Car newCar = new Car(myCity, 1, 1, Direction.NORTH);
        Tree tree1 = new Tree(myCity, 1, 2);
        Tree tree2 = new Tree(myCity, 1, 3);
        Tree tree3 = new Tree(myCity, 1, 4);

        newCar.turnRight();
        newCar.move(5);//Car can pass through. Great job.
    }//end of main
}//end of class
