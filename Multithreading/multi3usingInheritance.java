package Multithreading;

//Using Inheritance
//Here extends Thread represents that Inheritance is being used in the program

class Display extends Thread {

    // Writing run is must because using this we get to know that what we are going
    // to run thread
    // So when we start the thread compiler knows what are we looking for

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
