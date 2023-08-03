package Multithreading; // Declares the package name "Multithreading"

class My extends Thread { // Defines a class "My" that extends "Thread"

    // The "run" method is overridden from the "Thread" class.
    // This method contains an infinite loop that continuously prints "Class".
    public void run() {
        while (true) {
            System.out.println("Class");
        }
    }
}

public class multi6daemon { // Defines the main class "multi6daemon"

    public static void main(String arg[]) throws InterruptedException { // Main method, the entry point of the program
        My m = new My(); // Create an instance of the "My" class.

        m.setDaemon(true);
        // The setDaemon(true) method is called on the thread 'm'.
        // This sets the thread as a daemon thread.
        // Daemon threads are threads that run in the background and do not prevent the
        // JVM from exiting
        // if all other non-daemon threads have finished executing.

        m.start();
        // The start() method is called on the thread 'm', which begins the execution of
        // the run() method
        // in a separate thread. The run() method contains an infinite loop printing
        // "Class" repeatedly.

        Thread mainThread = Thread.currentThread();
        // Retrieve a reference to the main thread (the thread executing the main()
        // method).

        mainThread.join();
        // The join() method is called on the main thread.
        // This means that the main thread will wait for the 'm' thread to complete
        // before continuing its own execution.
        // However, since the 'm' thread is a daemon thread and runs indefinitely, the
        // main thread will not continue
        // beyond this point until the program is manually terminated.

        // Note: The program will keep running in an infinite loop, printing "Class"
        // repeatedly in the background.
        // The main thread is waiting for the daemon thread 'm' to complete, but it
        // won't happen as the 'm' thread
        // is running indefinitely due to the infinite loop in its run() method.
    }
}
