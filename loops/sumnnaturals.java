package loops; // Declares the package name "loops"

import java.util.*; // Imports classes from the java.util package

public class sumnnaturals { // Defines a class named "sumnnaturals"

    public static void main(String args[]) { // Main method, the entry point of the program

        System.out.println("Enter the Number:"); // Prompt the user to enter a number
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
        int n = sc.nextInt(); // Read the integer input from the user and store it in 'n'

        int sum = 0; // Initialize a variable 'sum' to store the sum of natural numbers

        // For loop to calculate the sum of natural numbers from 0 to 'n'
        for (int i = 0; i <= n; i++) { // Start the loop from i=0 and iterate until i<=n
            sum = sum + i; // Add the value of 'i' to the current value of 'sum'
        }

        System.out.println(sum); // Print the final sum of natural numbers

    }
}
