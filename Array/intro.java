package Array; // Declares the package name

import java.util.*; // Imports all classes from the java.util package

public class intro { // Defines a class named "intro"

    public static void main(String args[]) { // Main method, the entry point of the program

        // Ways to declare arrays
        int A[] = new int[10]; // Declares and initializes an integer array "A" with a size of 10
        int B[] = { 10, 3, 4, 56, 6 }; // Declares and initializes an integer array "B" with elements 10, 3, 4, 56, and
                                       // 6
        int C[]; // Declares an integer array reference "C"
        C = new int[10]; // Initializes the integer array "C" with a size of 10

        // Traversing an array

        for (int i = 0; i <= A.length; i++) { // Loop to traverse the array "A" (note the incorrect condition i <=
                                              // A.length, it should be i < A.length)
            System.out.println(B[i]); // Print the element at index "i" in the array "B"
        }

    }
}
