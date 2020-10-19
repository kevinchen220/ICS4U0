//MyFirstGUI Class
//Displays a basic window
//Created By: J. Burns
//Last Modified: 09/02/2015

import javax.swing.*;
import java.awt.*;

public class MyFirstGUI
{

    public static void main (String[] args)
    {
        //Variable Declaration
        JFrame main = new JFrame();            //The frame
        JPanel contents = new JPanel();        //Content Pane 

        JLabel lName = new JLabel("Name: ");   //User Name
        JTextField tName = new JTextField(25);
        JButton save = new JButton();          //Save Button


        //Set Attributes
        save.setText("Save");
        save.setPreferredSize(new Dimension(100,50));

        //Set ContentPane
        contents.add(lName);
        contents.add(tName);
        contents.add(save);

        main.setContentPane(contents);

        //Initialize Frame
        main.setTitle("My GUI");
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setLocation(250,100);
        main.setSize(300,150);
        main.setVisible(true);
    }
}