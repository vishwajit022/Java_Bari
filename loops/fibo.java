package loops; // Declares the package name "loops"

import java.util.*; // Imports classes from the java.util package

public class fibo { // Defines a class named "fibo"

    public static void main(String args[]) { // Main method, the entry point of the program

        System.out.println("Enter a Number for printing fibonacci Series"); // Prompt the user to enter a number
        Scanner sc = new Scanner(System.in); // Create a new Scanner object to read user input
        int n = sc.nextInt(); // Read the integer input from the user and store it in variable 'n'

        int a = 0; // Initialize variable 'a' to store the first number of the Fibonacci series,
                   // set to 0 initially
        int b = 1; // Initialize variable 'b' to store the second number of the Fibonacci series,
                   // set to 1 initially

        System.out.println(a); // Print the first number (0) of the Fibonacci series
        System.out.println(b); // Print the second number (1) of the Fibonacci series

        // Calculate and print the remaining numbers of the Fibonacci series using a for
        // loop
        for (int i = 1; i <= n; i++) { // Start the loop from i=1 and iterate until i reaches the entered number 'n'
            int c = a + b; // Calculate the next number of the Fibonacci series by adding 'a' and 'b'
                           // (previous two numbers)
            b = a; // Update 'b' to store the previous number 'a'
            a = c; // Update 'a' to store the current number 'c' for the next iteration
            System.out.println(c); // Print the current number 'c' of the Fibonacci series

            // For example, if the user enters n=5, the loop will execute as follows:
            // i=1, c=0+1=1, a=1, b=0, print 1
            // i=2, c=1+0=1, a=1, b=1, print 1
            // i=3, c=1+1=2, a=2, b=1, print 2
            // i=4, c=2+1=3, a=3, b=2, print 3
            // i=5, c=3+2=5, a=5, b=3, print 5
            // After the loop, the Fibonacci series up to the 5th number (0, 1, 1, 2, 3, 5)
            // will be printed.
        }
    }
}
