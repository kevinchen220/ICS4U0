/*
SnowMain
Created by: Kevin Chen
Last Modified: October 19, 2020
Description: To test the ShovelBot class
 */
 
import becker.robots.*;

public class SnowMain
{
   public static void main(String[] args)
   { 
    City c = new City("SnowCity.txt");  //The City
   
    //Create Shovel Bot objects
    ShovelBot jeeven = new ShovelBot(c, 0, 2, Direction.SOUTH);
    ShovelBot basmala = new ShovelBot(c, 0, 2, Direction.SOUTH);

    //Declaring Threads
    Thread shovelBot1 = new Thread(jeeven);
    Thread shovelBot2 = new Thread(basmala);

    //moves Basmala to street 6
    basmala.move(6);

    //Start Threads
    shovelBot1.start();
    shovelBot2.start();
    
   }//end of main
}//end of class