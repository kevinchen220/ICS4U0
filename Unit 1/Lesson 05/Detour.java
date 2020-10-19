/*
Detour
Created by: Kevin Chen
Last Modified: October 1, 2020
Description: A wall that looks like a Detour sign
 */

import becker.robots.*;

public class Detour extends Wall
{
    /*
    Default Constructor
    myCity - the City Detour will be in
    row - the Street Detour will be in
    column - the Avenue column will be in
     */
    public Detour(City myCity, int row, int column)
    {
        super(myCity, row, column, Direction.NORTH);
        this.setIcon(new DetourIcon());  //Set to DetourIcon
    }

    //For testing
    public static void main(String[] args)
    {
        City myCity = new City();
        Detour detour = new Detour(myCity, 1, 2);
    }//end of main
}//end of class
