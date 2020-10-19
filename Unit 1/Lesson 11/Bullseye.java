/*
Bullseye
Created by: Kevin Chen
Last Modified: October 13
Description: A JComponent that looks like a dart board made with scaling available
 */

import javax.swing.*;
import java.awt.*;

public class Bullseye extends JComponent
{
    //default constructor
    public Bullseye()
    {
        super();
        int width = 100;
        int height = 100;
        this.setPreferredSize(new Dimension(width, height));
    }

    //Drawing Bullseye
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //Use Graphics2D for scaling
        Graphics2D g2 = (Graphics2D) g;
        g2.scale(this.getWidth() / 16, this.getHeight() / 16);
        g2.setStroke(new BasicStroke(1.0F / this.getWidth()));

        //Loops through to apply different colors for the layers
        for (int i = 16; i > 0; i-=2)
        {
            if (i % 4 == 0)
            {
                g2.setColor(Color.RED);
            } else
            {
                g2.setColor(Color.GREEN);
            }
            g2.fillOval((16-i)/2, (16-i)/2, i, i);
        }
    }

    //for testing purposes
    public static void main(String[] arg)
    {
        //variable declaration
        JFrame myFrame = new JFrame();
        JPanel content = new JPanel();
        Bullseye bY = new Bullseye();

        content.add(bY);

        //JFrame setup
        myFrame.setContentPane(content);
        myFrame.setTitle("Bulls Eye");
        myFrame.pack();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }// end of main
}// end of class
