/*
Plagiarism
Created by: Kevin Chen
Last Modified: Sep 28, 2020
Description: A GUI that allows a user to enter personal information.
             Initially I had everything on one panel but could not figure out how to create the borders and title
             for genders. Then I found out I could add panels onto other panels, so I created a separate panel
             for genders to get the title and borders. I then decided to create a panel for different sections to
             keep things more organized.
 */

import javax.swing.*;
import java.awt.*;

public class Plagiarism
{
    public static void main(String[] args)
    {
        //Variable Declaration
        JFrame myFrame = new JFrame();            //The frame
        JPanel contents = new JPanel();        //Content Pane

        // Different Sections
        JPanel names = new JPanel();            //Names panel
        JPanel gender = new JPanel();           //Genders panel
        JPanel description = new JPanel();      //Descriptions panel
        JPanel buttons = new JPanel();          //Buttons Panel

        //Specifics
        JLabel firstName = new JLabel("First Name: ");      //First name
        JTextField fNameEntry = new JTextField(20);
        JLabel lastName = new JLabel("Last Name: ");        //Last name
        JTextField lNameEntry = new JTextField(20);

        JRadioButton male = new JRadioButton("Male");       //Male choice
        JRadioButton female = new JRadioButton("Female");   //Female choice

        JLabel descriptionLabel = new JLabel("Description");               //Description label
        JTextArea descriptionTextArea = new JTextArea(25, 40);    //Description text area
        descriptionTextArea.setLineWrap(true);                                  //Enable line wrap

        JButton save = new JButton("Save");                 //Save button
        JButton load = new JButton("Load");                 //Load button
        JButton quit = new JButton("Quit");                 //Quit button
        save.setPreferredSize(new Dimension(100, 50));      //Set size for buttons
        load.setPreferredSize(new Dimension(100, 50));
        quit.setPreferredSize(new Dimension(100, 50));

        //Add specifics to panels
        names.add(firstName);
        names.add(fNameEntry);
        names.add(lastName);
        names.add(lNameEntry);

        gender.setBorder(BorderFactory.createTitledBorder("Gender")); //Creating a title for the panel
        gender.add(male);
        gender.add(female);

        description.add(descriptionLabel);
        description.add(descriptionTextArea);

        buttons.add(save);
        buttons.add(load);
        buttons.add(quit);

        //Set ContentPane
        contents.add(names);
        contents.add(gender);
        contents.add(description);
        contents.add(buttons);

        myFrame.setContentPane(contents);

        //Initialize Frame
        myFrame.setTitle("Plagiarism");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLocation(500,200);
        myFrame.setSize(800,600);
        myFrame.setVisible(true);
    } // end of main
} //end of class
