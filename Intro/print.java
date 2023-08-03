package Intro; // Declares the package name "Intro"

import java.lang.*; // Imports classes from the java.lang package (not necessary in this code)

public class print { // Defines a class named "print"

    public static void main(String args[]) { // Main method, the entry point of the program

        int x = 10; // Declare and initialize an integer variable "x" with the value 10
        char v = 'v'; // Declare and initialize a character variable "v" with the value 'v'
        float f = 10.2f; // Declare and initialize a floating-point variable "f" with the value 10.2

        System.out.print("Hello"); // Prints the string "Hello" without a newline character
        System.out.println("Hello"); // Prints the string "Hello" and moves to the next line
        System.out.println("Hello"); // Prints the string "Hello" and moves to the next line

        // Prints the formatted string "Hello %d %c %f" where the placeholders %d, %c,
        // and %f
        // are replaced by the values of variables "x", "v", and "f" respectively
        System.out.printf("Hello %d %c %f", x, v, f);

        String str = "Java"; // Declare and initialize a string variable "str" with the value "Java"

        // Formats and prints the string "Java" with a total width of 2000 characters,
        // adding spaces to the left to meet the width (not relevant in this example)
        System.out.format("%2000s", str);

        // Using format, you can control the width and alignment of the output in the
        // console
        // by specifying placeholders and the values to be inserted into the
        // placeholders.

        // The above code will output:
        // HelloHello
        // Hello
        // Hello 10 v 10.2
        // Java

    }

}
