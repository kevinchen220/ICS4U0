/*
Pinsetter
Created by: Kevin Chen
Last Modified: October 1, 2020
Description: A Robot that can set bowling pins
*/

import becker.robots.*;

public class Pinsetter extends RobotSE
{
    /*
    Default Constructor
    aCity - the City the car will be in
    row - the Street the Car will be on
    column - the Avenue the Car will be on
    aDirection - the Direction the Car will face
     */
    public Pinsetter(City aCity, int row, int column, Direction aDirection)
    {
        super(aCity, row, column, aDirection, 10);
    }

    //final method to set the pins
    public void setPin()
    {
        this.move(2);
        this.turnLeft();
        this.firstColumn();
        this.secondColumn();
        this.thirdColumn();
        this.fourthColumn();
        this.returnHome();
    }

    //to set the first column
    private void firstColumn()
    {
        this.putMove();
        this.turnRight();
        this.move();
    }

    //to set the second column
    private void secondColumn()
    {
        this.turnRight();
        this.putMove();
        this.move();
        this.putMove();
        this.turnLeft();
        this.move();
    }

    //to set the third column
    private void thirdColumn()
    {
        this.turnLeft();
        this.putMove();
        this.move();
        this.putMove();
        this.move();
        this.putMove();
        this.turnRight();
        this.move();
    }

    //to set the fourth column
    private void fourthColumn()
    {
        this.turnRight();
        this.putMove();
        this.move();
        this.putMove();
        this.move();
        this.putMove();
        this.move();
        this.putMove();
    }

    //Back to original position
    private void returnHome()
    {
        this.turnRight();
        this.move(5);
        this.turnRight();
        this.move(4);
        this.turnRight();
    }

    //putting down a pin and moving forward
    private void putMove()
    {
        this.putThing();
        this.move();
    }

    //for testing purposes
    public static void main(String[] args)
    {
        //variable declaration
        City bowlingPit = new City();       //The City
        Pinsetter bob = new Pinsetter(bowlingPit, 3, 0, Direction.EAST);// The Pinsetter

        //Setting the pins
        bob.setPin();
    }
}
