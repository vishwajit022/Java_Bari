package Multithreading; // Declares the package name "Multithreading"

// Using Inheritance
// Here, 'extends Thread' represents that Inheritance is being used in the program.
class Display extends Thread {

    // Writing the 'run' method is a must because using this we specify what the
    // thread will execute.
    // When we start the thread, the compiler knows what task to run.

    // We don't write these methods as 'static' because it would break the contract
    // and behavior of how threads work in Java.
    // Each thread needs its own state and context, so making them static would lead
    // to incorrect behavior.

    public void run() {
        while (true) { // Infinite loop inside the 'run' method
            System.out.println("Class"); // Print "Class" in each iteration of the loop
        }
    }
}

public class multi3usingInheritance { // Defines a public class named "multi3usingInheritance"

    public static void main(String arg[]) { // Main method, the entry point of the program

        Display d = new Display(); // Create an instance of the 'Display' class which extends 'Thread'

        d.start(); // Start the thread associated with the 'Display' object 'd'

        // Here the difference is, when we use Interface (as in previous examples), we
        // need to create a separate 'Thread' class and pass the 'Runnable' object to
        // it.
        // But when it comes to Inheritance (using 'extends Thread'), things seem more
        // straightforward, as we directly inherit from the 'Thread' class.

        while (true) { // Infinite loop in the main method
            System.out.println("Main"); // Print "Main" in each iteration of the loop
        }

        // Note: This part of the code will never be reached due to the infinite loops
        // in both
        // the 'run' method of the 'Display' class and the 'while' loop in the 'main'
        // method.
        // The program will keep running until it is manually terminated.
    }
}
