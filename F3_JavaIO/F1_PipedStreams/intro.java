package F3_JavaIO.F1_PipedStreams;

import java.io.*;

/*The constructors are used to pass the necessary streams to the Producer and Consumer instances so that they can operate 
on the correct streams. Constructors help encapsulate the stream-handling logic within the classes 
and provide a way to initialize these classes with the required resources. */

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
