/*
TestSmileyFaceAdvanced
Created by: Kevin Chen
Last Modified: September 30, 2020
Description: A more advanced TestSmileyFace class that makes the SmileyFace
             appear when the button is pressed.
             Did some research about how to make something happen when
             a button is pressed.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestSmileyFaceAdvanced
{

    public static void main(String[] Args)
    {
        //Variable declaration
        JFrame myFrame = new JFrame();      //The frame
        JPanel myPanel = new JPanel();      //Content pane
        JButton sButton = new JButton("Smile!");       //Creates a smile button
        sButton.setPreferredSize(new Dimension(200, 100));//Set button size
        SmileyFace smile = new SmileyFace();//Creates SmileyFace
        smile.setVisible(false);            //not show smiley face

        //This makes the button able to collect commands happening to it
        sButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == sButton)
                {
                    smile.setVisible(true);         //Displays smiley face
                }
            }
        });

        //Add components to panel
        myPanel.add(smile);
        myPanel.add(sButton);

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


