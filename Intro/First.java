package Intro; // Declares the package name "Intro"

import java.util.*; // Imports classes from the java.util package
import java.lang.*; // Imports classes from the java.lang package

public class First { // Defines a class named "First"

    public static void main(String[] arg) { // Main method, the entry point of the program

        // The below code is commented out (multi-line comment) as it is not currently
        // being used
        // System.out.println("Hello World");
        // System.out.println("Enter two Numbers:");
        // Scanner sc = new Scanner(System.in);
        // int c;
        // int b;
        // int a;
        // a = sc.nextInt();
        // b = sc.nextInt();
        // c = a + b;
        // System.out.println("Addition of two Number is:" + c);

        // Displays a prompt asking for the user's name
        System.out.println("May I know whom I am Speaking with?");
        Scanner sc = new Scanner(System.in); // Creates a new Scanner object to read user input
        String name = sc.nextLine(); // Reads the user's name from the input
        System.out.println("Welcome back " + name); // Displays a welcome message along with the user's name

    }
}
