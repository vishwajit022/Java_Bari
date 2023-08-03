// Define a class "Yield" that extends the "Thread" class
class Yield extends Thread {
    // Override the "run()" method, which will be executed when the thread starts
    public void run() {
        int i = 0;
        // Run an infinite loop in the "Yield" thread
        while (true) {
            // Print "Class" followed by the value of 'i' and then increment 'i'
            System.out.println("Class" + i++);
        }
    }
}

// Main class "multi7yield"
public class multi7yield {
    public static void main(String arg[]) {
        // Create an instance of the "Yield" class, representing a thread
        Yield y = new Yield();
        // Start the "Yield" thread
        y.start();

        // Initialize a counter 'i' to 0
        int i = 0;

        // Run an infinite loop in the "main" thread
        while (true) {
            // Print "Main" followed by the value of 'i' and then increment 'i'
            System.out.println("Main" + i++);

            // Suggest to the scheduler to yield the current thread's execution
            y.yield();
        }
    }
}
