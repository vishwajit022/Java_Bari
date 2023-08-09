package F3_JavaIO.F1_PipedStreams;

import java.io.*;
/*Object Initialization: Constructors are used to initialize the state of an object when it is created. They ensure that the object starts with a valid and consistent state.

Memory Allocation: Constructors allocate memory for an object on the heap. They allow you to define how an object's memory should be allocated and set up.

Field Initialization: Constructors initialize the instance variables (fields) of an object to specific values. This ensures that the object has meaningful data to work with from the beginning.

Encapsulation: Constructors can enforce encapsulation by controlling the accessibility of certain fields or data during object creation. You can set certain fields as private and initialize them through the constructor, ensuring controlled access.

Default Initialization: If no constructor is defined, Java provides a default constructor that initializes fields to default values (e.g., 0 for numeric types, null for object references). Custom constructors allow you to avoid relying on default values.

Constructor Overloading: Like methods, constructors can be overloaded to create objects with different initial states. This provides flexibility in creating objects based on various parameter combinations.

Dependency Injection: Constructors are often used for dependency injection, where an object is provided with its required dependencies during creation. This promotes loose coupling and better modularization in code.

Immutable Objects: Constructors are crucial for creating immutable objects. Immutable objects are those whose state cannot be changed after creation. By initializing all fields in the constructor and not providing setters, you ensure the immutability of the object.

Inheritance and Superclass Initialization: Constructors are invoked when an object is created, including when it's a subclass. Constructors of the superclass are also invoked during subclass object creation, ensuring proper initialization throughout the inheritance hierarchy.

User-Friendly Interfaces: Constructors can enforce certain rules or validations during object creation. This helps ensure that objects are created with valid data, reducing the likelihood of errors later in the program.

Constructor Chaining: Constructors can call other constructors within the same class or in the superclass. This enables code reuse and allows you to define specific initializations in one constructor and build upon them in others. */

/*The constructors are used to pass the necessary streams to the Producer and Consumer instances so that they can operate 
on the correct streams. Constructors help encapsulate the stream-handling logic within the classes 
and provide a way to initialize these classes with the required resources. */
/*In summary, constructors are crucial for setting up objects in Java, initializing their state, enforcing rules, 
and ensuring that objects are created in a controlled and consistent manner. They play a fundamental role in establishing
 the behavior and characteristics of objects within a Java program. */

class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream o) {
        os = o; // Store the OutputStream in an instance variable for later use
    }

    public void run() {
        int count = 1;
        while (true) {
            try {
                // Write the current count to the OutputStream
                os.write(count);
                // Flush the OutputStream to ensure data is sent immediately
                os.flush();

                // Print a message to indicate the Producer's work along with the count
                System.out.println("Producer is working " + count);
                // Flush the console output to ensure the message is printed immediately
                System.out.flush();

                // Introduce a short delay before the next write
                Thread.sleep(10);
                count++;

            } catch (Exception e) {
                // Print any exceptions that occur during the process
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread {
    InputStream is;

    public Consumer(InputStream i) {
        is = i; // Store the InputStream in an instance variable for later use
    }

    public void run() {
        int x;
        while (true) {
            try {
                // Read a byte from the InputStream
                x = is.read();
                // Print the consumed value by the Consumer
                System.out.println("Consumer " + x);
                // Flush the console output to ensure the message is printed immediately
                System.out.flush();
            } catch (Exception e) {
                // Print any exceptions that occur during the process
                System.out.println(e);
            }
        }
    }
}

public class intro {
    public static void main(String arg[]) throws Exception {
        // Create a PipedInputStream and PipedOutputStream
        PipedInputStream pi = new PipedInputStream();
        PipedOutputStream po = new PipedOutputStream();

        // Connect the PipedInputStream to the PipedOutputStream
        pi.connect(po);

        // Create instances of Consumer and Producer, providing them with the piped
        // streams
        Consumer c = new Consumer(pi);
        Producer p = new Producer(po);

        // Start the Consumer and Producer threads
        c.start();
        p.start();
    }
}
