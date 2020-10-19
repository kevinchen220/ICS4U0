/*
Scatter
Created by: Kevin Chen
Last Modified: October 13
Description: A JComponent with scattered rays made with scaling available
 */

import javax.swing.*;
import java.awt.*;

public class Scatter extends JComponent
{
    //Default constructor
    public Scatter()
    {
        super();
        int width = 100;
        int height = 100;
        this.setPreferredSize(new Dimension(width, height));
    }

    //Draw Scatter
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        //Set scaling
        Graphics2D g2 = (Graphics2D) g;
        g2.scale(this.getWidth() / 11, this.getHeight() / 11);
        g2.setStroke(new BasicStroke(1.0F / this.getWidth()));

        //loops through to draw rays
        for (int i = 1; i < 11; i++)
        {
            g2.drawLine(1, 1, i, 10);
            g2.drawLine(1, 1, 10, i);
        }
    }

    //for testing purposes
    public static void main(String[] arg)
    {
        JFrame myFrame = new JFrame();
        JPanel content = new JPanel();
        Scatter sunshine = new Scatter();

        content.add(sunshine);

        myFrame.setContentPane(content);
        myFrame.setTitle("Scatter");
        myFrame.pack();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }// end of main
}// end of class
