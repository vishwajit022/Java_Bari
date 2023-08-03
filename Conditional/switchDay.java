package Conditional; // Declares the package name "Conditional"

import java.util.*; // Imports all classes from the java.util package

public class switchDay { // Defines a class named "switchDay"

    public static void main(String args[]) { // Main method, the entry point of the program

        Scanner sc = new Scanner(System.in); // Creates a new Scanner object to read user input

        int day = sc.nextInt(); // Reads an integer from the user input and stores it in the variable "day"

        // Use a switch statement to determine the day based on the value of "day"
        switch (day) {
            case 1:
                System.out.println("Mon"); // If "day" is 1, print "Mon"
                break;
            case 2:
                System.out.println("Tue"); // If "day" is 2, print "Tue"
                break;
            case 3:
                System.out.println("Wed"); // If "day" is 3, print "Wed"
                break;
            case 4:
                System.out.println("Thu"); // If "day" is 4, print "Thu"
                break;
            case 5:
                System.out.println("Fri"); // If "day" is 5, print "Fri"
                break;
            case 6:
                System.out.println("Sat"); // If "day" is 6, print "Sat"
                break;
            default:
                System.out.println("Invalid Input"); // If "day" is none of the above values, print "Invalid Input"
                break;
        }
    }
}
