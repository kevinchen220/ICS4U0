/*
TestTrailBot
Created by: Kevin Chen
Last Modified: September 29, 2020
Description: To test if TrailBot class works as expected.
 */

import becker.robots.*;

public class TestTrailBot
{
    public static void main(String[] Args)
    {
        //Variable Declaration
        City garbageCity = new City();
        TrailBot litterer = new TrailBot(garbageCity, 2, 1, Direction.EAST);

        //TrailBot actions
        litterer.trailMove();
        litterer.trailMove();
        litterer.trailMove();
        litterer.trailMove();
        litterer.trailMove();
    }//End of main
}//End of class
