package Multithreading;

// A class representing a display for showing strings
class Display {
    // A synchronized method to ensure mutual exclusion when accessing the display
    synchronized public void show(String s) {
        // Loop through each character in the string and display it
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }
}

// Thread1 class extends Thread, represents the first thread to display "Hello
// World"
class Thread1 extends Thread {
    Display d;

    // Constructor to initialize the Display object for Thread1
    public Thread1(Display d) {
        this.d = d;
    }

    // Run method for Thread1
    public void run() {
        // Call the show method of the Display object to display "Hello World"
        d.show("Hello World");
    }
}

// Thread2 class extends Thread, represents the second thread to display
// "Welcome All"
class Thread2 extends Thread {
    Display d;

    // Constructor to initialize the Display object for Thread2
    public Thread2(Display d) {
        this.d = d;
    }

    // Run method for Thread2
    public void run() {
        // Call the show method of the Display object to display "Welcome All"
        d.show("Welcome All");
    }
}

public class synchronization {
    public static void main(String arg[]) {
        // Create a Display object
        Display d = new Display();

        // Create Thread1 object and pass the Display object to its constructor
        Thread1 t = new Thread1(d);

        // Create Thread2 object and pass the Display object to its constructor
        Thread2 th = new Thread2(d);

        // Start Thread1 and Thread2,
    }
}