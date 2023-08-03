package Multithreading; // Declares the package name "Multithreading"

// Create a class 'My' that implements the 'Runnable' interface.
class My implements Runnable {

    // Implement the 'run' method as required by the 'Runnable' interface.
    // This method defines the task that will be executed by the thread when it
    // starts running.
    public void run() {
        while (true) { // Infinite loop inside the 'run' method
            System.out.println("Class"); // Print "Class" in each iteration of the loop
        }
    }
}

public class multi2interface { // Defines a public class named "multi2interface"

    public static void main(String arg[]) { // Main method, the entry point of the program

        // Create an instance of the 'My' class, which implements the 'Runnable'
        // interface.
        My m = new My();

        // Create a new 'Thread' object 't' and pass the 'My' object 'm' as an argument.
        // This associates the 'My' object with a separate thread of execution.
        Thread t = new Thread(m);

        // Start the newly created thread by calling the 'start' method on the 'Thread'
        // object 't'.
        // This will invoke the 'run' method defined in the 'My' class in a separate
        // thread.

        t.start(); // Start the thread associated with the 'My' object 'm'

        // The main thread continues with the following code.

        // The main thread enters an infinite loop and prints "Main" continuously.
        while (true) { // Infinite loop in the main method
            System.out.println("Main"); // Print "Main" in each iteration of the loop
        }

        // Note: This part of the code will never be reached due to the infinite loops
        // in both
        // the 'run' method of the 'My' class and the 'while' loop in the 'main' method.
        // The program will keep running until it is manually terminated.
    }
}
