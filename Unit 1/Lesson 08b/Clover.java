/*
Clover
Created by: Kevin Chen
Last Modified: October 8, 2020
Description: A JComponent with clovers in the four corners of it
 */


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class Clover extends JComponent
{
    // Default Constructor
    public Clover()
    {
        super();
        Dimension size = new Dimension (200, 200);
        this.setPreferredSize(size);
    }

    //Draws the four clovers in the four corners
    public void paintComponent(Graphics g)
    {
        //Loads in the image
        BufferedImage img = null;
        try
        {
            img = ImageIO.read(new File("C:\\Users\\Administrator\\IdeaProjects\\Lesson8b\\src", "Clover.png"));
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        //Draws the imported image in the four corners of the JComponent
        g.drawImage(img, 0, 0, 20, 20, null);
        g.drawImage(img, 180, 0, 20, 20, null);
        g.drawImage(img, 0, 180, 20, 20, null);
        g.drawImage(img, 180, 180, 20, 20, null);
    }

    //For testing purposes
    public static void main(String[] args)
    {
        JFrame myFrame = new JFrame();
        JPanel content = new JPanel();
        Clover test = new Clover();
        Clover test2 = new Clover();
        SmileyFace smile = new SmileyFace();

        content.add(test);
        content.add(smile);
        content.add(test2);

        myFrame.setContentPane(content);
        myFrame.setTitle("Clover");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);

    }// end of main
}// end of class
