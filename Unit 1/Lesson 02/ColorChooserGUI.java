/*
ColorChooserGUI
Created by: Kevin Chen
Last Modified: Sep 28, 2020
Description: A color picker.

Questions:
a. (255, 255, 200) is a light and faint yellow color.
b. (255, 255, 0) is a very bright yellow where as the previous one was a light and faint yellow.
c. (255, 193, 0) is an orange color.
d. I was able to create brown with (150, 100, 0) in RGB and (40, 100. 30) in HSB. For me RGB was definitely
easier as I have used it before and its easier to understand in my opinion.
 */

import javax.swing.*;
import java.awt.*;

public class ColorChooserGUI
{
    public static void main (String[] args)
    {
        //Variable Declaration
        JFrame myFrame = new JFrame();            //The frame
        JPanel contents = new JPanel();           //Content Pane

        JColorChooser color = new JColorChooser();// Color Chooser

        //Set ContentPane
        contents.add(color);

        myFrame.setContentPane(contents);

        //Initialize Frame
        myFrame.setTitle("My GUI");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLocation(500,200);
        myFrame.setSize(700,400);
        myFrame.setVisible(true);
    } //end of main
} //end of class
