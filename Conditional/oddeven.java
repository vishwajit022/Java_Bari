package Conditional; // Declares the package name "Conditional"

import java.util.*; // Imports all classes from the java.util package

public class oddeven { // Defines a class named "oddeven"

    public static void main(String args[]) { // Main method, the entry point of the program

        Scanner sc = new Scanner(System.in); // Creates a new Scanner object to read user input

        System.out.println("Enter a number"); // Prompt the user to enter a number
        int n = sc.nextInt(); // Reads an integer from the user input and stores it in the variable "n"

        // Check if the value of "n" is even using the condition (n % 2 == 0)
        if (n % 2 == 0) {
            System.out.println("Number is Even"); // If "n" is even, print "Number is Even"
        } else {
            System.out.println("Number is Odd"); // If "n" is odd, print "Number is Odd"
        }
    }
}
