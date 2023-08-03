package Intro; // Declares the package name "Intro"

import java.util.*; // Imports classes from the java.util package

public class input { // Defines a class named "input"

    public static void main(String arg[]) { // Main method, the entry point of the program

        // Display a prompt asking the user to enter two numbers
        System.out.println("Enter two numbers");

        // Create a new Scanner object to read user input from the console
        Scanner sc = new Scanner(System.in);

        // Declare integer variables to store the numbers entered by the user
        int a, b, c;

        // Read the first number entered by the user and store it in variable "a"
        a = sc.nextInt();

        // Read the second number entered by the user and store it in variable "b"
        b = sc.nextInt();

        // Perform addition of the two numbers and store the result in variable "c"
        c = a + b;

        // Display the result (sum of the two numbers) to the console
        System.out.println(c);

    }
}
