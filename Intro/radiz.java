package Intro; // Declares the package name "Intro"

import java.util.*; // Imports classes from the java.util package

public class radiz { // Defines a class named "radiz"

    public static void main(String arg[]) { // Main method, the entry point of the program

        Scanner sc = new Scanner(System.in); // Create a new Scanner object to read user input from the console

        sc.useRadix(2); // Set the scanner to interpret the input as binary (base 2) numbers

        int x = sc.nextInt(); // Read an integer entered by the user, which is interpreted as binary

        System.out.println(x); // Print the value of "x" (interpreted as a decimal number) to the console

        // Input: 1010 (binary)
        // Output: 10 (decimal)
        // Explanation: The input binary number "1010" is converted to its decimal
        // representation.
        // The 8421 concept is used for the conversion:
        // 1 * 2^3 + 0 * 2^2 + 1 * 2^1 + 0 * 2^0 = 8 + 0 + 2 + 0 = 10 (decimal)

    }
}
