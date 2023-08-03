package Multithreading; // Declares the package name "Multithreading"

public class multi3zhatkastyle extends Thread { // Defines a class "multi3zhatkastyle" that extends "Thread"

    // Writing the 'run' method is a must because using this we specify what the
    // thread will execute.
    // When we start the thread, the compiler knows what task to run.

    // We don't write these methods as 'static' because it would break the contract
    // and behavior of how threads work in Java.
    // Each thread needs its own state and context, so making them static would lead
    // to incorrect behavior.

    public void run() { // Overrides the 'run' method from the 'Thread' class
        while (true) { // Infinite loop inside the 'run' method
            System.out.println("Run"); // Print "Run" in each iteration of the loop
        }
    }

    public static void main(String arg[]) { // Main method, the entry point of the program

        multi3zhatkastyle m = new multi3zhatkastyle(); // Create an instance of the 'multi3zhatkastyle' class

        m.start(); // Start the thread associated with the 'multi3zhatkastyle' object 'm'

        // Note: When we use Inheritance and extend the 'Thread' class, we don't need to
        // create a separate 'Thread' object and pass the 'Runnable' object to it (as in
        // the case of implementing the 'Runnable' interface).
        // Here, the 'multi3zhatkastyle' class directly inherits from the 'Thread'
        // class, so it can directly use the 'start' method to start the thread.

        while (true) { // Infinite loop in the main method
            System.out.println("Main"); // Print "Main" in each iteration of the loop
        }

        // Note: This part of the code will never be reached due to the infinite loops
        // in both
        // the 'run' method of the 'multi3zhatkastyle' class and the 'while' loop in the
        // 'main' method.
        // The program will keep running until it is manually terminated.
    }
}
