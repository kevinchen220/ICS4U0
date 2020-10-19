/*
CheckerBoard
Created by: Kevin Chen
Last Modified: October 13
Description: A JComponent that looks like a checker board made with scaling available
 */

import javax.swing.*;
import java.awt.*;

public class CheckerBoard extends JComponent
{
    //Default constructor
    public CheckerBoard()
    {
        super();
        int width = 200;
        int height = 200;
        this.setPreferredSize(new Dimension(width, height));
    }

    //Draw the checker board
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //Uses Graphics2D for scaling
        Graphics2D g2 = (Graphics2D) g;
        g2.scale(this.getWidth() / 10, this.getHeight() / 10);
        g2.setStroke(new BasicStroke(1.0F / this.getWidth()));

        //loops through each row and column to color the blocks
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (i % 2 == j % 2)
                {
                    g2.setColor(Color.WHITE);
                } else
                {
                    g2.setColor(Color.BLACK);
                }
                g2.fillRect(i, j ,1 ,1 );
            }
        }
    }

    //for testing purposes
    public static void main(String[] arg)
    {
        JFrame myFrame = new JFrame();
        JPanel content = new JPanel();
        CheckerBoard board = new CheckerBoard();

        content.add(board);

        myFrame.setContentPane(content);
        myFrame.setTitle("Small Circles");
        myFrame.pack();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }// end of main
}// end of class
