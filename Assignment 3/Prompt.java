/*
Prompt
Created by: Kevin Chen
Last Modified: October 22, 2020
Description: Used to take all sorts of inputs
 */

import java.io.*;
import java.util.Scanner;

public class Prompt
{
    private static final Scanner in = new Scanner(System.in);
    //
    // Reads console input and checks if it is the correct type (int)
    //
    public static int getInt(String prompt)
    {
        //
        // Loop until a valid entry is received
        //
        while(true)
        {
            //
            // Get input
            //
            System.out.println(prompt);

            //
            // Check if it is an integer
            //
            if(Prompt.in.hasNextInt())
            {
                // Integer inputted, return result
                int answer = Prompt.in.nextInt();
                Prompt.in.nextLine();
                return answer;
            }
            else
            {
                // Invalid data type entered
                String input = Prompt.in.nextLine();
                System.out.println("Error:" + input + " is not an integer.");
            }
        }
    }

    //takes an integer input between a specified range
    public static int getInt(String prompt, int min, int max)
    {
        //
        // Loop until a valid entry is received
        //
        while(true)
        {
            //
            // Get input
            //
            System.out.println(prompt);

            //
            // Check if it is an integer
            //
            if(Prompt.in.hasNextInt())
            {
                int answer = Prompt.in.nextInt();
                Prompt.in.nextLine();
                //check if it is between the range
                if (min <= answer && answer <= max)
                {
                    return answer;
                }
                //Not within the range
                System.out.println("Error: " + answer + " is not between " + min + " & " + max);
            }
            else
            {
                // Invalid data type entered
                String input = Prompt.in.nextLine();
                System.out.println("Error:" + input + " is not an integer.");
            }
        }
    }

    //Takes a Double input
    public static double getDouble(String prompt)
    {
        //
        // Loop until a valid entry is received
        //
        while(true)
        {
            //
            // Get input
            //
            System.out.println(prompt);

            //
            // Check if it is a double
            //
            if(Prompt.in.hasNextDouble())
            {
                // Double inputted, return result
                double answer = Prompt.in.nextDouble();
                Prompt.in.nextLine();
                return answer;
            }
            else
            {
                // Invalid data type entered
                String input = Prompt.in.nextLine();
                System.out.println("Error:" + input + " is not a double.");
            }
        }
    }

    //takes a float input within a specified range
    public static float getFloat(String prompt, float min, float max)
    {
        //
        // Loop until a valid entry is received
        //
        while(true)
        {
            //
            // Get input
            //
            System.out.println(prompt);
            //
            // Check if it is a float
            //
            if(Prompt.in.hasNextFloat())
            {
                float answer = Prompt.in.nextFloat();
                Prompt.in.nextLine();
                // checks if it is between the range
                if (min <= answer && answer <= max)
                {
                    return answer;
                }
                // Not between the range
                System.out.println("Error: " + answer + " is not between " + min + " & " + max);
            }
            else
            {
                // Invalid data type entered
                String input = Prompt.in.nextLine();
                System.out.println("Error:" + input + " is not an float.");
            }
        }
    }

    //takes a String input
    public static String getString(String prompt)
    {
        //Takes the input
        System.out.println(prompt);
        String input = Prompt.in.nextLine();
        return input;
    }

    //get a file input
    public static File getInputFile(String prompt)
    {
        //loops until a valid input
        while (true)
        {
            System.out.println(prompt);
            String name = Prompt.in.nextLine(); //take in file name as a String
            File inputFile = new File(name);    //create File object
            if(!inputFile.exists())             //checks if file exist
            {
                System.out.println("Error: " + name + " does not exist.");
            } else if (inputFile.isDirectory()) //checks if file is directory
            {
                System.out.println("Error: " + name + " is a directory");
            } else if (!inputFile.canRead())    //checks if the file can be read
            {
                System.out.println("Error: " + name + " cannot be read.");
            } else                              //successful
            {
                return inputFile;
            }
        }
    }

    //Scanner object to read files
    public static Scanner getInputScanner(String prompt)
    {
        try
        {
            return new Scanner(Prompt.getInputFile(prompt));            //tries to read file
        } catch (FileNotFoundException e)                               //catches exceptions
        {
            //displays what went wrong
            System.out.println(e.getMessage());
            System.out.println("in" + System.getProperty("user.dir"));
            System.exit(1);
        }
        return null;
    }

    //create PrintWriter object to create new file
    public static PrintWriter getPrintWriter(String prompt)
    {
        System.out.println(prompt);

        //take name for the output file
        String name = in.nextLine();
        File outputFile = new File(name);

        try
        {
            return new PrintWriter(outputFile);         //try to return PrintWriter object
        }
        catch (FileNotFoundException e)
        {
            //tells user about exception caught
            System.out.println(e.getMessage());
            System.out.println("in" + System.getProperty("user.dir"));
            System.exit(1);
        }
        return null;
    }

    // Code to test class
    public static void main(String[] args) {
        Scanner in = Prompt.getInputScanner("Enter the file name: ");
        PrintWriter out = Prompt.getPrintWriter("Enter the new file name: ");
        while(in.hasNextLine())
        {
            String line = in.nextLine();
            line = line + "changed";
            out.println(line);
        }
        in.close();
        out.close();
    }// end of main
}//end of class