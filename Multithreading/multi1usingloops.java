package Multithreading; // Declares the package name "Multithreading"

class Display { // Defines a class named "Display"

    public static void display() { // Static method to display "Class" indefinitely
        while (true) { // Infinite loop, will keep printing "Class" repeatedly
            System.out.println("Class"); // Print "Class" in each iteration of the loop
        }
    }
}

public class multi1usingloops { // Defines a public class named "multi1usingloops"

    public static void main(String arg[]) { // Main method, the entry point of the program

        Display d = new Display(); // Create an object of the "Display" class

        d.display(); // Call the "display" method of the "Display" class
        // This will only print "Class" because the control won't get a chance to get
        // into the main while loop
        // The previous call to "d.display()" will keep executing in an infinite loop.

        while (true) { // Infinite loop in the main method
            System.out.println("Main"); // Print "Main" in each iteration of the loop
        }

    }

}
