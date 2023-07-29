package Multithreading;

//Using Inheritance
//Here extends Thread represents that Inheritance is being used in the program

class Display extends Thread {

    // Writing run is must because using this we get to know that what we are going
    // to run thread
    // So when we start the thread compiler knows what are we looking for

    // Why we don't write these methods as static why do we get error when we
    // declare it as static
    // Answer because it would break the contract and behavior of how threads work
    // in Java.
    public void run() {
        while (true) {
            System.out.println("Class");
        }
    }
}

public class multi3usingInheritance {
    public static void main(String arg[]) {
        Display d = new Display();
        d.start();

        // Here the difference is When we use Interface we need to create a Thread class
        // but when it comes to Inheritance things seems more easier

        while (true) {
            System.out.println("Main");
        }

    }
}
