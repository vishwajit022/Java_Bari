package F2_Lambda;

// Functional interface Mylambda with a single abstract method 'display(String str)'.
// The @FunctionalInterface annotation is used to indicate that this interface is a functional interface.
// Functional interfaces can have only one abstract method and can be used as lambda expressions or method references.
@FunctionalInterface
interface Mylambda {
    // Abstract method 'display(String str)' with a single parameter of type String.
    void display(String str);
}

// Main class passingarg
public class passingarg {
    // This is the main class containing the main method, the entry point of the
    // program.

    public static void main(String arg[]) {
        // The main method starts here.

        // Create an object 'm' of the Mylambda using a lambda expression.
        // The lambda expression (s) -> { System.out.println(s); } implements the
        // 'display(String str)' method of Mylambda.
        // The lambda expression accepts a single argument 's' (String) and prints it to
        // the console.

        Mylambda m = (s) -> {
            // The body of the lambda expression starts here.
            // This block of code will be executed when the 'display(String str)' method of
            // Mylambda is called.
            System.out.println(s);
            // The code inside the lambda expression prints the value of the 's' parameter
            // to the console.
        };

        // Call the 'display(String str)' method of the Mylambda using the object 'm'
        // and passing the argument "Hello".
        // This will invoke the implementation provided in the lambda expression,
        // printing "Hello" to the console.
        m.display("Hello");
        // The output will be: "Hello"
    }
}
