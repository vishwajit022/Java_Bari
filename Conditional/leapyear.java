package Conditional; // Declares the package name "Conditional"

import java.util.*; // Imports all classes from the java.util package

public class leapyear { // Defines a class named "leapyear"

    public static void main(String arg[]) { // Main method, the entry point of the program

        Scanner sc = new Scanner(System.in); // Creates a new Scanner object to read user input

        int y = sc.nextInt(); // Reads an integer from the user input and stores it in the variable "y"

        // Check if the value of "y" is a leap year using the conditions: (y % 4 == 0)
        // and ((y % 100 == 0 && y % 400 == 0))
        if (y % 4 == 0 && y % 100 == 0 && y % 400 == 0) {
            System.out.println("The year is Leap year"); // If "y" is a leap year, print "The year is Leap year"
        } else {
            System.out.println("Not a Leap Year"); // If "y" is not a leap year, print "Not a Leap Year"
        }
    }
}
