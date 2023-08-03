package Multithreading; // Declares the package name "Multithreading"

class Display extends Thread { // Defines a class "Display" that extends "Thread"

    // Constructor of the "Display" class with a parameter "name"
    Display(String name) {
        super(name); // Call the constructor of the superclass "Thread" with the given "name"
    }

}

public class multi4constructor { // Defines the main class "multi4constructor"

    public static void main(String arg[]) { // Main method, the entry point of the program

        Display d = new Display("Vishu"); // Create an instance of the "Display" class with the name "Vishu"

        // The 'super' keyword is used to call the constructor of the superclass
        // "Thread" with the given "name".

        System.out.println("Thread Name: " + d.getName()); // Print the name of the thread using the 'getName()' method.
        System.out.println("Thread ID: " + d.threadId()); // Print the ID of the thread using the 'threadId()' method.
        System.out.println("Priority: " + d.getPriority()); // Print the priority of the thread using the
                                                            // 'getPriority()' method.
    }
}
