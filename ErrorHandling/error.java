package ErrorHandling; // Declares the package name "ErrorHandling"

public class error { // Defines a class named "error"

    public static void main(String arg[]) { // Main method, the entry point of the program

        int a, b, c; // Declare integer variables "a", "b", and "c"

        a = 5; // Assign the value 5 to variable "a"
        b = 0; // Assign the value 0 to variable "b"

        // Use a try-catch block to handle potential exceptions
        try {
            c = a / b; // Perform the division and store the result in "c"

            // If no exception occurred, print the result of the division
            System.out.println(c);

        } catch (ArithmeticException e) { // Catch block for catching ArithmeticException
            System.out.println(e); // Print the exception information to the console
            System.out.println("Division by zero"); // Print a custom message indicating division by zero
        } catch (Exception e) { // Catch block for catching other types of exceptions (superclass of all
                                // exceptions)
            System.out.println(e); // Print the exception information to the console
        }

        // It is essential to write a catch block for the superclass of exceptions
        // (Exception class) at the end to catch any other unhandled exceptions
        // that might occur during execution.

    }

}
