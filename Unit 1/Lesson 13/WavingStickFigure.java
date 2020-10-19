/*
WavingStickFigure
Created by: Kevin Chen
Last Modified: October 15, 2020
Description: A waving stick man
 */

import javax.swing.*;
import java.awt.*;

public class WavingStickFigure extends JComponent
{
    //instance variables
    private int leftArmX = 75;              //x coordinate of left arm
    private int rightArmX = 275;            //x coordinate of right arm
    private int armY = 250;                 //y coordinates of the arms
    private final int upY = 30;             //expected y value at up position
    private final int straightY = 140;      //expected y value at straight position
    private final int downY = 250;          //expected y value at down position
    private final int armLength = 150;      //length of arm

    //default constructor
    public WavingStickFigure()
    {
        super();
        this.setPreferredSize(new Dimension(350, 400));
    }

    //draw the stick figure
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        //the head
        g2.fillOval(125, 0, 100, 100);

        //the body
        g2.setStroke(new BasicStroke(20));
        g2.drawLine(175, 50, 175, 225);

        //the legs
        g2.setStroke(new BasicStroke(15));
        g2.drawLine(175, 225, 100, 400);
        g2.drawLine(175, 225, 250, 400);

        //the arms
        g2.setStroke(new BasicStroke(10));
        g2.drawLine(175, 140, leftArmX, armY);
        g2.drawLine(175, 140, rightArmX, armY);
    }

    //calculates the x value of the arms when they move
    private void calculateX()
    {
        //pythagorean
        int sideX = (int) Math.sqrt(Math.pow(armLength, 2) - Math.pow((armY - 140), 2));
        leftArmX = 175 - sideX;
        rightArmX = 175 + sideX;
    }

    //moves the arms up
    public void setUp()
    {
        //arm movement
        while (armY > upY)
        {
            armY --;
            calculateX();
            this.repaint();
            try
            {
                Thread.sleep(10);
            } catch (InterruptedException e)
            {
            }
        }
        try
        {
            Thread.sleep(500);
        } catch (InterruptedException e)
        {
        }
    }

    //sets arms to down position
    public void setDown()
    {
        //moves arms down
        while (armY < downY)
        {
            armY ++;
            calculateX();
            this.repaint();
            try
            {
                Thread.sleep(10);
            } catch (InterruptedException e)
            {
            }
        }
        try
        {
            Thread.sleep(500);
        } catch (InterruptedException e)
        {
        }
    }

    //sets the arms to straight position
    public void setStraight()
    {
        //moves the arms up if it is at down position
        while (armY < straightY)
        {
            armY ++;
            calculateX();
            this.repaint();
            try
            {
                Thread.sleep(10);
            } catch (InterruptedException e)
            {
            }
        }

        //moves the arms down if it is in the up position
        while (armY > straightY)
        {
            armY --;
            calculateX();
            this.repaint();
            try
            {
                Thread.sleep(10);
            } catch (InterruptedException e)
            {
            }
        }
        try
        {
            Thread.sleep(500);
        } catch (InterruptedException e)
        {
        }
    }

    //For testing purposes
    public static void main(String[] args)
    {
        JFrame myFrame = new JFrame();
        JPanel content = new JPanel();
        WavingStickFigure bob = new WavingStickFigure();

        content.add(bob);

        myFrame.setContentPane(content);

        myFrame.setTitle("Waving Stick Figure");
        myFrame.pack();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);

        bob.setUp();
        bob.setDown();
        bob.setStraight();
        bob.setDown();
        bob.setUp();

        bob.setStraight();
    }//end of main
}//end of class
