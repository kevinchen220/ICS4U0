/*
TestLamp
Created by: Kevin Chen
Last Modified: September 29, 2020
Description: Testing to see if the Lamp class works properly.
 */

import becker.robots.*;

public class TestLamp
{
    public static void main(String[] args)
    {
        //Variable Declaration
        City lampTown = new City();                                     //The city
        RobotSE car = new RobotSE(lampTown, 3, 0, Direction.EAST);//The robot

        //The lamps
        Lamp lamp1 = new Lamp(lampTown, 3, 1);
        Lamp lamp2 = new Lamp(lampTown, 3, 2);
        Lamp lamp3 = new Lamp(lampTown, 3, 3);
        Lamp lamp4 = new Lamp(lampTown, 3, 4);
        Lamp lamp5 = new Lamp(lampTown, 3, 5);

        //Moves car and loops to check if robot is over a lamp
        for (int i = 0; i < 6; i ++)
        {
            car.move();
            lamp1.check(car);
            lamp2.check(car);
            lamp3.check(car);
            lamp4.check(car);
            lamp5.check(car);
        }// End of For loop
    }//End of main
}//End of Class
