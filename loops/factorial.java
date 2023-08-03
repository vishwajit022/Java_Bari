package loops; // Declares the package name "loops"

import java.util.*; // Imports classes from the java.util package

public class factorial { // Defines a class named "factorial"

    public static void main(String arg[]) { // Main method, the entry point of the program

        System.out.println("Enter the Number:"); // Prompt the user to enter a number
        Scanner sc = new Scanner(System.in); // Create a new Scanner object to read user input
        int a = sc.nextInt(); // Read the integer input from the user and store it in variable 'a'

        int b = 1; // Initialize variable 'b' to store the factorial, set to 1 initially

        // Calculate the factorial of the entered number using a for loop
        for (int i = 1; i <= a; i++) { // Start the loop from i=1 and iterate until i reaches the entered number 'a'
            b = b * i; // Multiply the current value of 'b' with the loop counter 'i' to update the
                       // factorial value

            // For example, for a=5, the loop will execute as follows:
            // i=1, b=1*1=1
            // i=2, b=1*2=2
            // i=3, b=2*3=6
            // i=4, b=6*4=24
            // i=5, b=24*5=120
            // After the loop, 'b' will store the factorial of 'a' (120)
        }

        System.out.println(b); // Print the calculated factorial value to the console

    }
}
