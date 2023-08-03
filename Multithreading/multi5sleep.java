package Multithreading; // Declares the package name "Multithreading"

class Display extends Thread { // Defines a class "Display" that extends "Thread"

    // The "run" method is overridden from the "Thread" class.
    public void run() {
        int i = 1; // Initialize a variable "i" with the value 1.
        while (true) { // Infinite loop to continuously execute the following code.

            i = i + 1; // Increment the value of "i" by 1.

            // Print "Class" followed by the value of "i".
            // Note: The post-increment operator (i++) is used here, so the value of "i"
            // will be incremented after printing.
            System.out.println("Class" + i++);

            try {
                // Put the current thread to sleep for 10000 milliseconds (10 seconds).
                // This will pause the execution of the thread for the specified duration.
                Thread.sleep(10000);
            } catch (Exception e) {
                // If any exception occurs while sleeping, print the exception message.
                System.out.println(e);
            }

        }
    }
}

public class multi5sleep { // Defines the main class "multi5sleep"

    public static void main(String arg[]) { // Main method, the entry point of the program

        Display d = new Display(); // Create an instance of the "Display" class.

        d.start(); // Start the thread by calling the "start" method on the "Display" object.

        // Note: The "run" method of the "Display" class will start executing
        // concurrently with the main thread.
        // However, the "run" method will not run continuously as it contains a sleep of
        // 10 seconds,
        // so it will print "Class" and increment the value of "i" every 10 seconds.

        // The main thread will continue with any code following the "d.start()"
        // statement,
        // but since there is no additional code in the "main" method, it will terminate
        // once the "d.start()" is called.
        // The "Display" thread will continue running in the background until the
        // program is manually terminated.
    }
}
