/*
Main
Created by: Kevin Chen
Last Modified: October 14, 2020
Description: to test SimpleBot and SimpleBot2, just edit the bot declared to be SimpleBot or SimpleBot2
 */

import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        //Variable Declaration
        SimpleCity myCity = new SimpleCity();
        SimpleBot2 bot = new SimpleBot2();
        bot.setColor(Color.ORANGE);

        myCity.add(bot, 2);  // Add a robot to the second layer of the city

        myCity.waitForStart();    // Wait for the user to press the start button.

        //Bot movement
        bot.move();
        bot.turnRight();
        bot.move();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.move();
        bot.teleport(0,0);
    }// end of main
}// end of Class