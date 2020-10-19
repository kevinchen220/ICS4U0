/*
SimpleBot2
Created by: Kevin Chen
Last Modified: October 14, 2020
Description: Basically SimpleBot but with eyes
 */

import java.awt.*;
import becker.util.Utilities;

public class SimpleBot2 extends Paintable {

    //Declare Variables
    private int street; //The current street
    private int avenue; //The current avenue
    private int direction; //The current direction

    private int horizontalSteps; //The steps taken between Street intersections
    private int verticalSteps;   //The steps taken between Avenue intersections
    private Color botColor;      //The robot's color

    //Constants to represent direction
    private final int EAST = 0;
    private final int SOUTH = 1;
    private final int WEST = 2;
    private final int NORTH = 3;

    /**
     * Default constructor that creates a SimpleBot at 5,6 facing East*/
    public SimpleBot2 ( )
    {
        super ( );
        this.street = 3;
        this.avenue = 3;
        this.direction = this.EAST;
    }

    /**
     * Displays the SimpleBot
     * @param g The graphics object*/
    public void paint (Graphics2D g)
    {
        g.setColor(this.botColor);
        g.fillOval(this.avenue * 50 + 12 * horizontalSteps, this.street * 50 + 12 * verticalSteps, 50,50);
        // draws the eyes according to the direction it is facing
        switch (this.direction)
        {
            case NORTH:
                g.setColor(Color.WHITE);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 15, this.street * 50 + 12 * verticalSteps + 10, 10,10);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 25, this.street * 50 + 12 * verticalSteps + 10, 10,10);
                g.setColor(Color.BLACK);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 18, this.street * 50 + 12 * verticalSteps + 12, 4,4);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 28, this.street * 50 + 12 * verticalSteps + 12, 4,4);
                break;
            case SOUTH:
                g.setColor(Color.WHITE);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 15, this.street * 50 + 12 * verticalSteps + 30, 10,10);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 25, this.street * 50 + 12 * verticalSteps + 30, 10,10);
                g.setColor(Color.BLACK);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 18, this.street * 50 + 12 * verticalSteps + 35, 4,4);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 28, this.street * 50 + 12 * verticalSteps + 35, 4,4);
                break;
            case EAST:
                g.setColor(Color.WHITE);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 30, this.street * 50 + 12 * verticalSteps + 15, 10,10);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 30, this.street * 50 + 12 * verticalSteps + 25, 10,10);
                g.setColor(Color.BLACK);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 35, this.street * 50 + 12 * verticalSteps + 18, 4,4);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 35, this.street * 50 + 12 * verticalSteps + 28, 4,4);
                break;
            case WEST:
                g.setColor(Color.WHITE);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 10, this.street * 50 + 12 * verticalSteps + 15, 10,10);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 10, this.street * 50 + 12 * verticalSteps + 25, 10,10);
                g.setColor(Color.BLACK);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 12, this.street * 50 + 12 * verticalSteps + 18, 4,4);
                g.fillOval(this.avenue * 50 + 12 * horizontalSteps + 12, this.street * 50 + 12 * verticalSteps + 28, 4,4);
                break;
        }
    }

    /**
     * Moves the SimpleBot forward one intersection in the direction it is facing*/
    public void move()
    {
        //Loops through four steps when moving through an intersection
        for (int i = 0; i < 4; i++)
        {
            switch (this.direction)
            {
                case NORTH:
                    this.verticalSteps --;
                    break;
                case SOUTH:
                    this.verticalSteps ++;
                    break;
                case EAST:
                    this.horizontalSteps ++;
                    break;
                case WEST:
                    this.horizontalSteps --;
                    break;
            }
            Utilities.sleep(100);
        }
        this.horizontalSteps = 0;
        this.verticalSteps = 0;
        this.street = this.street + this.streetOffset();
        this.avenue = this.avenue + this.avenueOffset();
    }

    //Modifies the current avenue when moving based on the direction of the SimpleBot
    private int avenueOffset()
    {
        int offset = 0; //the amount to change the current street by
        if (this.direction == this.EAST)//moving East
        {
            offset =1;
        }
        else if (this.direction == this.WEST)//moving West
        {
            offset = -1;
        }
        return offset;
    }

    //Modifies the current street when moving based on the direction of the SimpleBot
    private int streetOffset()
    {
        int offset = 0; //the amount to change the current avenue by
        if (this.direction == this.NORTH)//moving North
        {
            offset =-1;
        }
        else if (this.direction == this.SOUTH)//moving South
        {
            offset = 1;
        }
        return offset;
    }

    /** Turns the SimpleBot 90 degrees to the Left*/
    public void turnLeft()
    {
        if (this.direction == this.EAST)//Turn to face north
        {
            this.direction = this.NORTH;
        }
        else{
            this.direction  -=1;
        }
        Utilities.sleep(400);
    }

    //allows the bot to turn right
    public void turnRight()
    {
        if (this.direction == this.NORTH)//Turn to face north
        {
            this.direction = this.EAST;
        }
        else{
            this.direction  +=1;
        }
        Utilities.sleep(400);
    }

    //teleports the robot to any intersection facing the same direction
    public void teleport(int street, int avenue)
    {
        Utilities.sleep(200);
        this.street = street;
        this.avenue = avenue;
    }

    //sets the robot's color
    public void setColor(Color color)
    {
        this.botColor = color;
    }

}