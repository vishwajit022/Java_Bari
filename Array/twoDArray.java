package Array; // Declares the package name

import java.util.*; // Imports all classes from the java.util package

public class twoDArray { // Defines a class named "twoDArray"

    public static void main(String arg[]) { // Main method, the entry point of the program

        // Ways to declare 2-d Array
        int A[][] = new int[5][5]; // Declares and initializes a 2D integer array "A" with dimensions 5x5
        int B[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // Declares and initializes a 2D integer array "B" with
                                                               // specific elements
        int C[][]; // Declares a 2D integer array reference "C"
        C = new int[5][5]; // Initializes the 2D integer array "C" with dimensions 5x5
        int[] D[] = new int[5][5]; // Declares and initializes a 2D integer array "D" with dimensions 5x5

        // Traversing an array

        for (int i = 0; i < B.length; i++) { // Outer loop to traverse rows of the 2D array "B"
            for (int j = 0; j < B[i].length; j++) { // Inner loop to traverse columns of each row in the 2D array "B"
                System.out.print(B[i][j] + "\t"); // Print the element at row "i" and column "j" in the 2D array "B"
            }
            System.out.println(" "); // Print a blank line after each row is traversed
        }

    }
}
