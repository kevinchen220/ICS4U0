/*
VerticalLines
Created by: Kevin Chen
Last Modified: October 13
Description: A JComponent that draws vertical lines made with scaling available
 */

import javax.swing.*;
import java.awt.*;

public class VerticalLines extends JComponent
{
    //default constructor
    public VerticalLines()
    {
        super();
        int width = 100;
        int height = 100;
        this.setPreferredSize(new Dimension(width, height));
    }

    //draws Vertical lines
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.scale(this.getWidth() / 10, this.getHeight() / 10);
        g2.setStroke(new BasicStroke(1.0F / this.getWidth()));

        //loops through drawing lines
        for (int i = 1; i < 11; i++)
        {
            g2.drawLine(i, 0, i, 10);
        }
    }

    //for testing purposes
    public static void main(String[] arg)
    {
        JFrame myFrame = new JFrame();
        JPanel content = new JPanel();
        VerticalLines vL = new VerticalLines();

        content.add(vL);

        myFrame.setContentPane(content);
        myFrame.setTitle("Vertical Lines");
        myFrame.pack();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }//end of main
}// end of class
