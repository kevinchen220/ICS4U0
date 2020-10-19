/*
BeHappy
Created by: Kevin Chen
Last Modified: October 8, 2020
Description: To test out the SmileyFace class
 */

import javax.swing.*;

public class BeHappy
{

    public static void main(String[] args)
    {
        //Variable declaration
        JFrame myFrame = new JFrame();
        JPanel content = new JPanel();
        SmileyFace smile = new SmileyFace();

        //Adding components to JPanel
        content.add(smile);

        //Setting content pane
        myFrame.setContentPane(content);

        //Setting up JFrame
        myFrame.setTitle("Be Happy");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);

    }//end of main
}//end of class
