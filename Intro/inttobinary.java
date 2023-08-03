package Intro; // Declares the package name "Intro"

import java.util.*; // Imports classes from the java.util package

public class inttobinary { // Defines a class named "inttobinary"

    public static void main(String args[]) { // Main method, the entry point of the program

        int a = 5; // Declare and initialize an integer variable "a" with the value 5

        // Convert the integer "a" to its binary representation using the
        // Integer.toBinaryString() method
        // and print the result to the console
        System.out.println(Integer.toBinaryString(a));

        // Output: 101 (binary representation of the decimal number 5)

    }

}
