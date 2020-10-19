/*
TestSmileyFace
Created by: Kevin Chen
Last Modified: September 30, 2020
Description: Test if the SmileyFace class works properly.
 */

import javax.swing.*;
import java.awt.*;

public class TestSmileyFace
{
    public static void main(String[] Args)
    {
        //Variable declaration
        JFrame myFrame = new JFrame();      //The frame
        JPanel myPanel = new JPanel();      //Content pane
        JButton smileyButton = new JButton("Smile!");       //Creates a smile button
        smileyButton.setPreferredSize(new Dimension(200, 100));//Set button size
        SmileyFace smile = new SmileyFace();        //Creates SmileyFace

        //Add components to panel
        myPanel.add(smile);
        myPanel.add(smileyButton);

        //Set content pane
        myFrame.setContentPane(myPanel);

        //Initialize frame
        myFrame.setTitle("Smiley Face");
        myFrame.setSize(300, 400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLocation(500,200);
        myFrame.setVisible(true);
    }//end of main
}//end of class


