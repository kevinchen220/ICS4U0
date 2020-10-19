/*
SmallCircles
Created by: Kevin Chen
Last Modified: October 13
Description: A JComponent that draws a table of circles made with scaling available
 */

import javax.swing.*;
import java.awt.*;

public class SmallCircles extends JComponent
{
    //default constructor
    public SmallCircles()
    {
        super();
        int width = 100;
        int height = 100;
        this.setPreferredSize(new Dimension(width, height));
    }

    //draw SmallCircles
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        //Set scaling
        Graphics2D g2 = (Graphics2D) g;
        g2.scale(this.getWidth() / 5, this.getHeight() / 5);
        g2.setStroke(new BasicStroke(1.0F / this.getWidth()));

        //loops to draw circles
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                //draws the yellow cross
                if (i == 2 || j == 2)
                {
                    g2.setColor(Color.YELLOW);
                } else
                {
                    g2.setColor(Color.BLACK);
                }
                g2.fillOval(i, j ,1 ,1 );
            }
        }
    }

    //for testing purposes
    public static void main(String[] arg)
    {
        JFrame myFrame = new JFrame();
        JPanel content = new JPanel();
        SmallCircles sC = new SmallCircles();

        content.add(sC);

        myFrame.setContentPane(content);
        myFrame.setTitle("Small Circles");
        myFrame.pack();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }// end of main
}// end of class
