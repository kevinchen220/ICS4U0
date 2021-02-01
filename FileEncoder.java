/*
FileEncoder
Created by: Kevin Chen
Last Modified: October 27, 2020
Description:
a program (FileEncoder.java) that will read multiple sentences (lines) from a text file and creates a coded version
of the file input. The name of the file to input will be read using the appropriate JFileChooser class method.

The file input will be encoded based on the following rules:
1. The case of all letters in the alphabet will be swapped. Lower case letters become upper case letters and
lower-case letters become upper case letters.
2. A user entered integer value (range -10 to 10) that will be added to the decimal integer ascii value of
each character. This offset character will replace the original character.

This coded sentence will be then written to a user entered filename (through the console using Prompt class)
text file and written to the console as output in string form.
 */

import java.util.*;
import java.io.*;
import javax.swing.*;


public class FileEncoder {
    //instance variable
    static int offset;  //how much to shift the letters

    /*Main Method to run program*/
    public static void main(String[] args)
    {
        //variable declaration
        Scanner in = getScanner("Choose the file you want to encode");      //Create the scanner class
        PrintWriter out = Prompt.getPrintWriter("Enter file name to output to: ");  //Create the PrintWriter class
        offset = Prompt.getInt("Enter coding key value Input Range: Min: -10 Max: 10: ", -10, 10);  //how much to shift each character

        /*
        while loop
        loops through the chosen file to read all lines in it
         */
        while (in.hasNextLine())
        {
            String currentLine = in.nextLine();                 //takes one line at a time as input
            String outputMsg = encodeMsg(currentLine, offset);  //encode the current line of message
            System.out.println(outputMsg);                      //outputs the encoded version of the current line to the console
            out.println(outputMsg);                             //outputs the encoded version of the current line to the file to be saved
        }// end of while loop

        //closing input and output files
        in.close();         //close Scanner
        out.close();        //close PrintWriter

    }//end of main

    /*
    encodeMsg
    encodes the message provided as a parameter

    message - the message to be encoded
    codeOffset - how much to shift each letter

    return
    String - the encoded message
     */
    public static String encodeMsg(String message, int codeOffset)
    {
        //variable declaration
        String encodedMsg = "";     //to store the encoded message
        char currentChar;           //the current character
        int currentAscii;           //ascii of current character

        /*
        for loop
        loops through the message to encode one letter at a time
         */
        for (int i = 0; i < message.length(); i ++)
        {
            currentChar = message.charAt(i);    //takes current character

            //checks if character is upper or lower case
            if (Character.isLowerCase(message.charAt(i)))
            {
                 currentChar = Character.toUpperCase(currentChar);  //turns letter to upper case
            } else if(Character.isUpperCase(message.charAt(i)))
            {
                currentChar = Character.toLowerCase(currentChar);   //turns letter to lower case
            }
            currentAscii = (int) currentChar + codeOffset;          //adds offset amount to current character ascii
            encodedMsg = encodedMsg + (char) currentAscii;          //adds the shifted character to the encoded message
        }
        return encodedMsg;      //returns the encoded message

    } //end of encodeMsg

    /*
    getScanner
    opens valid input file

    prompt - inform the user for what they should do

    return
    Scanner - for reading in things in the file
     */
    public static Scanner getScanner(String prompt)
    {
        System.out.println(prompt);//print out the prompt

        JFileChooser fileChooser = new JFileChooser();  //new JFileChooser
        int fileSelected = fileChooser.showOpenDialog(null);    //select file

        //check if file is approved
        if(fileSelected == JFileChooser.APPROVE_OPTION)
        {
            File myFile = fileChooser.getSelectedFile();    //save file if approved
            try
            {
                return new Scanner(myFile);        //returns the file name
            } catch (FileNotFoundException e)
            {
                //displays what went wrong
                System.out.println(e.getMessage());
                System.out.println("in" + System.getProperty("user.dir"));
                System.exit(1);
            }
        }
        return null;
    } //end of getScanner

}//end of class





