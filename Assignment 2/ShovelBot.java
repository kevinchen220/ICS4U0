/*
ShovelBot
Created by: Kevin Chen
Last Modified: October 19, 2020
Description: A Robot that shovels snow on the sidewalk and drive way
 */

import becker.robots.*;

public class ShovelBot extends RobotSE implements Runnable
{
     //Instance Variables
     private int snowCount;   //How much snow a robot has shoveled
     private int endStreet;   //At what street will the Robot stop.
                              // Can also be passed through the default constructor.

     /*
     Default Constructor
     aCity - the City ShovelBot will be in
     row - the Street ShovelBot will be on
     column - the Avenue ShovelBot will be on
     aDirection - the Direction ShovelBot will be facing
      */
     public ShovelBot(City aCity, int row, int column, Direction aDirection)
     {
          super(aCity, row, column, aDirection);
     }

      //Check east of current location for a driveway
     private boolean checkForDriveWay(){
          
          this.turnLeft(); //turn east
          
          //If front is clear there is a driveway
          if(this.frontIsClear()) {
               //Driveway detected
               this.move();
               return true;
          }
          else {
               //No driveway
               this.turnRight();
               return false;
          }
     }//end of checkForDriveWay()

     //To clear a drive way
     private void clearDriveWay()
     {
          this.clearRow();    //Clears a street
          this.turnRight();   //turns right at the end of street
          if (frontIsClear())
          {
               //moves if the drive way is two intersections wide
               this.move();
          }
          this.turnRight();   //ready for next row
          this.clearRow();
     }// end of clearDriveWay

     /*
     Helper method for clearDriveWay()
     Purpose: clears a single row of the drive way
      */
     private void clearRow()
     {
          //While the ShovelBot is not at the end of a drive way, it will continue to move
          while(!checkEnd())
          {
               this.move();
          }
          this.shovelSnow();  //shovels the snow on the last intersection if there is any since the loop has ended.
     }//end of clearRow

     /*
     Helper method for clearRow()
     Purpose: checks if ShovelBot is at end of drive way
      */
     private boolean checkEnd()
     {
          return !this.frontIsClear();  //returns true if not clear and false if clear
     }// end of checkEnd

     //Shovels snow if there is a Thing on the Intersection
     private void shovelSnow()
     {
          //checks for a Thing on the intersection
          if (this.isBesideThing(IPredicate.aThing))
          {
               this.pickThing();   //shovels the snow
               this.snowCount++;   //adds to snowCount
          }
     }//end of shovelSnow

     //Accessor method to get how much snow is shoveled
     public int getSnowCount()
     {
          return this.snowCount;   //returns the amount of snow shoveled
     }// end of getSnowCount

     //Overrides the move method to shovel snow when moving if there is any
     public void move()
     {
          this.shovelSnow();  //shovels snow if there is any
          super.move();       //move to next intersection
     }// end of move

     //moving d intersections without shoveling the snow
     public void move(int d)
     {
          //loops d times to move d intersections
          for (int i = 0; i < d; i++)
          {
               super.move();
          }
     }//end of move(int d)

     //To clear the snow
     private void clearSnow()
     {
          /*
          This if else statement is to set the ending positions of Jeeven and Basmala.
          endStreet can also be declared in the constructor to be more customizable.
          */
          if (this.getStreet() == 6)
          {
               this.endStreet = 9;
          } else
          {
               this.endStreet = 6;
          }

          //Loops until ShovelBot is on its end Street
          while(this.getStreet() < this.endStreet)
          {
               //Checks for a drive way
               if (checkForDriveWay())
               {
                    //clears the drive way when it comes across one
                    clearDriveWay();
                    this.turnLeft();    //back to the sidewalk
               }
               //moves to next intersection on the side walk
               this.move();
          }
     }// end of clearSnow

     //For thread to run
     public void run()
     {
          clearSnow();
     }//end of run
}//end of Class
