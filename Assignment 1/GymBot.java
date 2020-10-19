/*
GymBot
Created by: Kevin Chen
Last Modified: October 6, 2020
Description: A robot that does gymnastics
 */

import becker.robots.*;
import java.awt.*;

public class GymBot extends RobotSE
{
    /*
    Default Constructor
    aCity - The City GymBot will be in
    row - The Street GymBot will be on
    column - The Avenue GymBot will be on
    aDirection - The Direction GymBot will be facing
     */
    public GymBot(City aCity, int row, int column, Direction aDirection)
    {
        super(aCity, row, column, aDirection);
        this.setColor(Color.BLUE);              // Sets Color of GymBot to BLUE
    }

    //Override the move method to do somersault after moving
    public void move()
    {
        super.move();
        this.turnRight(4);
    }

    //Allows the GymBot to jump over one intersection
    public void shortJump()
    {
        this.turnLeft();
        super.move();
        this.turnRight();
        super.move();
        this.turnRight();
        super.move();
        this.turnLeft();
    }

    //Allows the GymBot to jump over 4 intersections but with a 2 intersection running start
    public void highJump()
    {
        //before the jump
        this.turnAround();
        super.move();
        super.move();
        this.turnAround();
        super.move();
        super.move();

        //the jump
        this.turnLeft();
        super.move();
        this.turnRight();
        super.move();
        super.move();
        super.move();
        super.move();
        this.turnRight();
        super.move();

        //landing
        this.turnLeft();
        this.move();
    }

}// end of class
