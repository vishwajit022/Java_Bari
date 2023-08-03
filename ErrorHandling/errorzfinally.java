package ErrorHandling; // Declares the package name "ErrorHandling"

public class errorzfinally { // Defines a class named "errorzfinally"

    public static void main(String arg[]) { // Main method, the entry point of the program

        try {
            System.out.println(10 / 0); // Attempting to divide by zero, which will cause an ArithmeticException to be
                                        // thrown
        } catch (Exception e) { // Catches any exception that occurs during the execution of the try block
            System.out.println(e); // Prints the exception information to the console
        } finally {
            // The code inside the "finally" block will always execute, regardless of
            // whether an exception occurred or not
            System.out.println("Final Message"); // Prints "Final Message" to the console
        }
    }
}
