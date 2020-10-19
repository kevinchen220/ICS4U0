/*
SimpleGUI
Created by: Kevin Chen
Last Modified: Sep 28, 2020
Description: Using JTextArea and line wrap.

Questions:
b. When the text is too long it does not display fully.
 */

import javax.swing.*;
import java.awt.*;

public class SimpleGUI
{
    public static void main (String[] args)
    {
        //Variable Declaration
        JFrame myFrame = new JFrame();         //The frame
        JPanel contents = new JPanel();        //Content Pane

        JTextArea myText = new JTextArea("Welcome to this simple GUI. I will be trying to fit this entire " +
                "sentence inside this text area.", 5, 18); //Create text area
                //This is split into multiple lines for display purposes in the IDE.
        myText.setLineWrap(true);                              // enabling line wrap in the text area



        //Set ContentPane
        contents.add(myText);

        myFrame.setContentPane(contents);

        //Initialize Frame
        myFrame.setTitle("SimpleGUI");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLocation(500,200);
        myFrame.setSize(200,150);
        myFrame.setVisible(true);
    } //end of main
} // end of class